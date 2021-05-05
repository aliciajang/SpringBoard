package com.springbook.biz.board;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import org.hibernate.annotations.CreationTimestamp;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="BOARD")
@Getter @Setter @ToString
public class BoardVO {

	@Id
	@GeneratedValue
	private int seq;
	private String title;
	private String writer;
	private String content;
	
	@CreationTimestamp
	private Timestamp regDate;
	private int cnt;

}


