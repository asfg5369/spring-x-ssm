package com.ssm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ssm.pojo.Permissions;
import com.ssm.pojo.Roles;
import com.ssm.pojo.Users;
import com.ssm.service.IPermissionsService;
import com.ssm.service.IRolesService;
import com.ssm.service.IUsersService;

@Controller
public class AdminController {
	@Autowired
	private IRolesService iRolesService;
	@Autowired
	private IPermissionsService iPermissionsService;
	@Autowired
	private IUsersService iUsersService;
	// 查询所有角色
	@RequestMapping("/getAllRoles")
	public ModelAndView getAllRole(ModelAndView mv) {
		Wrapper<Roles> wrapper = new EntityWrapper<>();
		List<Roles> list = iRolesService.selectList(wrapper);
		mv.addObject("list", list);
		mv.setViewName("admin-role");
		return mv;

	}
	// 查询所有权限
	@RequestMapping("/getAllPermissions")
	public ModelAndView getAllPermissions(ModelAndView mv) {
		Wrapper<Permissions> wrapper = new EntityWrapper<>();
		List<Permissions> list = iPermissionsService.selectList(wrapper);
		mv.addObject("list", list);
		mv.setViewName("admin-permission");
		return mv;
	}
	//查询所有用户
	@RequestMapping("/getAllUsers")
	public ModelAndView getAllUsers(ModelAndView mv) {
		Wrapper<Users> wrapper = new EntityWrapper<>();
		List<Users> list = iUsersService.selectList(wrapper);
		mv.addObject("list", list);
		mv.setViewName("admin-list");
		return mv;
	}
}
