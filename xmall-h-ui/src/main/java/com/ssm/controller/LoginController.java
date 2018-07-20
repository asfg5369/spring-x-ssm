package com.ssm.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.google.code.kaptcha.Constants;
import com.ssm.pojo.Users;
import com.ssm.service.IUsersService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class LoginController {
	@Autowired
	private IUsersService iUsersService;
	@RequestMapping("/loginValify")
	@ResponseBody
	public Map<String, Object> loginValify(Model model, HttpServletRequest request) {
		String username = request.getParameter("userName");
		String password = request.getParameter("password");
		String verifyCode=request.getParameter("verifyCode").toUpperCase();
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Map<String, Object> resultMap = new LinkedHashMap<String, Object>();
		if(verifyCode.equals(request.getSession().getAttribute(Constants.KAPTCHA_SESSION_KEY))){
			try {
				token.setRememberMe(false);
				subject.login(token);
				//System.out.println("permission:"+subject.isPermitted("user:*"));
				System.out.println("------------------身份认证成功-------------------");
				resultMap.put("status", 200);
				resultMap.put("message", "登录成功！");
			} catch (ExcessiveAttemptsException e) {
				resultMap.put("status", 500);
				resultMap.put("message", "重试失败5次,10分钟后请再试!");
			} catch (AccountException e) {
				resultMap.put("status", 500);
				resultMap.put("message", "账号或者密码错误!");
			} catch (AuthenticationException e) {
				resultMap.put("status", 500);
				resultMap.put("message", "身份认证失败！");
			} catch (Exception e) {
				resultMap.put("status", 500);
				resultMap.put("message", "未知错误！");
			}
		}else{
			resultMap.put("status", 406);
			resultMap.put("message", "验证码错误！");
		}
		return resultMap;
	}
	/**
	 * 退出
	 * 
	 * @param model
	 * @param request
	 * @return
	 */
	@RequestMapping("/logout")
	public String logout(Model model, HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		request.getSession().removeAttribute("name");
		return "login";
	}

	@RequestMapping("/index")
	public String index(HttpServletRequest request) {
		Subject subject = SecurityUtils.getSubject();
		HttpSession session = request.getSession();
		Wrapper<Users> wrapper=new EntityWrapper<>();
		session.setAttribute("name", iUsersService.selectOne(wrapper.eq("username", subject.getPrincipal().toString())).getUsername());
		return "index";
	}
	@RequestMapping("/login")
	public String indexParam() {
		return "login";
	}
}
