package com.waylau.spring.boot.domain;

/**
 * User.
 * 
 * @since 1.0.0 2019年2月13日
 * @author <a href="https://waylau.com">Way Lau</a>
 */
public class User {

	private Long id;

	private String name;

	private String email;

	public User() {
	}
	
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return String.format("User[id=%d, name='%s', email='%s']", id, name, email);
	}
}
