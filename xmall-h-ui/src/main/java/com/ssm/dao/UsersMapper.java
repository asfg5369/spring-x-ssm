package com.ssm.dao;

import java.util.List;
import java.util.Set;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ssm.pojo.Users;

/**
 * <p>
 * Mapper接口
 * </p>
 *
 * @since 2018-06-25
 */
public interface UsersMapper extends BaseMapper<Users> {

	Set<String> findRoles(Long id);

	Set<String> findPermissions(Long id);
	
	List<Users> selectAllDesc();
}