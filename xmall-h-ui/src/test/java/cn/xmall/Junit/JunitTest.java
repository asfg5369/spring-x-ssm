package cn.xmall.Junit;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.ssm.pojo.Permissions;
import com.ssm.pojo.Users;
import com.ssm.service.IPermissionsService;
import com.ssm.service.IUsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.Set;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })
public class JunitTest {

	@Autowired
	private IUsersService iUserService;

	@Autowired
	private IPermissionsService iPermissionsService;

	 /*@Test
	 public void Junit1() {
	 Users users = iUserService.selectById((long)1);
	 System.out.println(JSON.toJSON(users));
	 }*/
	// @Test
	// public void Junit2() {
	// Set<String> set = iUserService.findRoles((long)1);
	// System.out.println(JSON.toJSON(set));
	// }
	// @Test
	// public void Junit3() {
	// Wrapper<Users> wrapper=new EntityWrapper<>();
	// //wrapper.like("username", "a").isNotNull("password");
	// wrapper.like("username", "d");
	// List<Users> list = iUserService.selectList(wrapper);
	// System.out.println(JSON.toJSON(list));
	// }
	// @Test
	// public void Junit4() {
	// Page<Users> page=new Page<>(1, 2);
	// Page<Users> selectPage = iUserService.selectPage(page);
	// System.out.println(JSON.toJSON(selectPage));
	// }
	@Test
	public void Junit5() {
		Wrapper<Permissions> wrapper = new EntityWrapper<>();
		List<Permissions> list = iPermissionsService.selectList(wrapper);
		System.out.println(JSON.toJSON(list));
	}

	//selectAllDesc
	@Test
	public void Junit6() {
		List<Users> list = iUserService.selectAllDesc();
		System.out.println(JSON.toJSON(list));
	}
	@Test
	public void Junit7(){
		Set<String> res = iUserService.findRoles((long)1);
		System.out.println(res.toString());
		System.out.println(JSON.toJSONString(res));
	}
	@Test
	public void Junit8(){
		Set<String> res = iUserService.findPermissions((long) 1);
		System.out.println(res.toString());
		System.out.println(JSON.toJSONString(res));
	}
	@Test
	public void Junit9(){
	}
}
