package com.yonyou.nc.bc.dto;

public class ErrorMsg {
  private String msg;
  private int statusCode;
  
  
  
public ErrorMsg(String msg) {
	super();
	this.msg = msg;
	this.statusCode = 200;
}
public ErrorMsg(String msg, int statusCode) {
	super();
	this.msg = msg;
	this.statusCode = statusCode;
}
public String getMsg() {
	return msg;
}
public void setMsg(String msg) {
	this.msg = msg;
}
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
  
  
}
