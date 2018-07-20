package com.ssm.service;

import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.service.IService;
import com.ssm.pojo.Users;

/**
 * <p>
 * 服务类
 * </p>
 * @since 2018-06-25
 */
public interface IUsersService extends IService<Users> {
	Set<String> findRoles(Long id);

	Set<String> findPermissions(Long id);
	//selectAll
	List<Users> selectAllDesc();
}
