package com.ps.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Song implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;

	public Song() {
		super();
	}

	public Song(String name) {
		super();
		this.name = name;
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
	
	

}
