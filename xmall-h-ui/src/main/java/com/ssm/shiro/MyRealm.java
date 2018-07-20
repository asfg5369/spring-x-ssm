/**
 * 
 */
package com.ssm.shiro;

import javax.annotation.Resource;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ssm.pojo.Users;
import com.ssm.service.IUsersService;

/**
 * @ClassName: MyRealm
 * @Description: shiro 认证 + 授权 重写
 */
public class MyRealm extends AuthorizingRealm {
	@Resource
	IUsersService userService;

	/**
	 * 授权Realm
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String username = (String) principals.getPrimaryPrincipal();
		Wrapper<Users> wrapper = new EntityWrapper<>();
		wrapper.eq("username", username);
		Users users = userService.selectOne(wrapper);
		Long id = users.getId();
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		/** 根据用户ID查询角色（role），放入到Authorization里. */
		info.setRoles(userService.findRoles(id));
		/** 根据用户ID查询权限（permission），放入到Authorization里. */
		info.setStringPermissions(userService.findPermissions(id));
		return info;
	}

	/**
	 * 登录认证Realm
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) {
		String username = (String) token.getPrincipal();
		Wrapper<Users> wrapper = new EntityWrapper<>();
		wrapper.eq("username", username);
		Users users = userService.selectOne(wrapper);
		if (users == null) {
			throw new AccountException("帐号或密码不正确");
		}
		String password = users.getPassword();
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(username, // 用户名
				password, // 密码
				ByteSource.Util.bytes(users.getSalt()), getName() // realm name
		);
		return authenticationInfo;
	}

}
