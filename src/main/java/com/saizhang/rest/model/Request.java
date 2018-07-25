package com.saizhang.rest.model;

public class Request {

	private String method;
	private String txt;
	
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public String getTxt() {
		return txt;
	}
	public void setTxt(String txt) {
		this.txt = txt;
	}
	
	@Override
	public String toString() {
		return "Request [method=" + method + ", txt=" + txt + "]";
	}
}
