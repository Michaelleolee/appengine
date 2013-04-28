package oop.appengine.examples.showcase.data;

import oop.appengine.examples.showcase.entity.Role;
import oop.appengine.examples.showcase.entity.User;
import oop.appengine.modules.test.data.RandomData;

/**
 * 用户测试数据生成.
 * 
 * @author calvin
 */
public class UserData {

	public static User randomUser() {
		String userName = RandomData.randomName("User");

		User user = new User();
		user.setLoginName(userName);
		user.setName(userName);
		user.setPlainPassword("123456");
		user.setEmail(userName + "@springside.org.cn");

		return user;
	}

	public static User randomUserWithAdminRole() {
		User user = UserData.randomUser();
		Role adminRole = UserData.adminRole();
		user.getRoleList().add(adminRole);
		return user;
	}

	public static Role adminRole() {
		Role role = new Role();
		role.setId(1L);
		role.setName("Admin");

		return role;
	}
}
