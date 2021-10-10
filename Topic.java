package io.javabrains.springbootstarter.topic;

public class Topic {
	private String id;
	private String name;
	private String descripyion;
	
	
	public Topic(String id, String name, String descripyion) {
		super();
		this.id = id;
		this.name = name;
		this.descripyion = descripyion;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescripyion() {
		return descripyion;
	}
	public void setDescripyion(String descripyion) {
		this.descripyion = descripyion;
	}
	
}
