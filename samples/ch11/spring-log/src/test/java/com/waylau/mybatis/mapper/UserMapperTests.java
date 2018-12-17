/**
 * Welcome to https://waylau.com
 */
package com.waylau.mybatis.mapper;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.waylau.mybatis.domain.User;

/**
 * UserMapper Tests.
 * 
 * @since 1.0.0 2018年8月19日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@SpringJUnitConfig(locations = "/spring.xml")
class UserMapperTests {

	@Autowired
	private UserMapper userMapper;

	@Test
	void testCreateUser() {
		User user = new User(1L, "老卫");
		int i = userMapper.createUser(user);
		assertEquals(1, i);
	}

	@Test
	void testGetUser() {
		User user = userMapper.getUser(1L);
		User user2 = new User(1L, "老卫");
		assertEquals(user.toString(), user2.toString());
	}

	@Test
	void testUpdateUser() {
		User user = userMapper.getUser(1L);
		user.setUsername("waylau");
		int i = userMapper.updateUser(user);
		assertEquals(1, i);

		User user2 = userMapper.getUser(1L);
		assertEquals(user.toString(), user2.toString());
	}
	
	@Test
	void testDeleteUser() {
		int i = userMapper.deleteUser(1L);

		assertEquals(1, i);
	}

}
