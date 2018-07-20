package com.ssm.service.impl;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ssm.dao.UsersMapper;
import com.ssm.pojo.Users;
import com.ssm.service.IUsersService;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author tangguo
 * @since 2018-06-25
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements IUsersService {
	@Autowired
	private UsersMapper mapper;

	@Override
	public Set<String> findRoles(Long id) {
		return mapper.findRoles(id);
	}

	@Override
	public Set<String> findPermissions(Long id) {
		return mapper.findPermissions(id);
	}

	@Override
	public List<Users> selectAllDesc() {
		return mapper.selectAllDesc();
	}

}
