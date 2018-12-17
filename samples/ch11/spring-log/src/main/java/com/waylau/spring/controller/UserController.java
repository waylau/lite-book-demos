package com.waylau.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.waylau.mybatis.domain.User;
import com.waylau.mybatis.mapper.UserMapper;


/**
 * Hello 控制器.
 * 
 * @since 1.0.0 2018年12月21日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	private UserMapper userMapper;
	
	/**
	 *  根据id查询用户
	 * @param id
	 * @return
	 */
	@GetMapping("/{id}")
	public User getUserById(@PathVariable Long id) {
	    return userMapper.getUser(id);
	}
	
	/**
	 * 创建用户
	 * @param user
	 * @return
	 */
	@PostMapping
	public int createUser(@RequestBody User user) {
		return userMapper.createUser(user);
	}

	/**
	 * 删除用户
	 * @param id
	 */
	@DeleteMapping("/{id}")
	public int deleteUser(@PathVariable Long id) {
		return userMapper.deleteUser(id);
	}

	/**
	 * 修改用户
	 * @param user
	 * @return
	 */
	@PutMapping
	public int  updateUser(@RequestBody User user) {
		return userMapper.updateUser(user);
	}
}
