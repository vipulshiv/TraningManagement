package com.practice.scms.model;

/**
 * Course is a model, used to transfer details from one layer to other
 */

public class Course {
	
	/**
	 * id of course is primary key, and Auto Increment.
	 */
	private Integer id;
	/**
	 * userid of course is foreign key, and mapped with (id) from  .
	 */
	private Integer userid;
	/**
	 * title of course ,it is NN.
	 */
	private String title;
	/**
	 * duration of course ,it is NN.
	 */
	private Integer duration;
	/**
	 * description of course ,it is NN.
	 */
	private String description;
	/**
	 * status of course ,it is NN.
	 */
	private Integer status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	
}
