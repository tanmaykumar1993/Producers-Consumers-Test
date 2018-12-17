package com.kafka.SpringKafka;
public class Greeting {
 
	private Integer id;
    private String msg;
    private String name;
	public Greeting(String msg, String name, Integer id) {
		super();
		this.id = id;
		this.msg = msg;
		this.name = name;
	}
	public Greeting() {	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Greeting [id=" + id + ", msg=" + msg + ", name=" + name + "]";
	}
	    
}