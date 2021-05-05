package com.springbook.biz.user;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="USERS")
@Getter @Setter @ToString
public class UserVO {
	
	@Id
	private String id;
	private String password;
	private String name;
	private String role;

}

