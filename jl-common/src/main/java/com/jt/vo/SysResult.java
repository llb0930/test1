package com.jt.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
public class SysResult {

	
	
	private Integer status ;
	private String  msg;
	private Object  data;  
	
	//提供一些重载方法
	 public static SysResult fail() {
		 
		 
		 return new SysResult(201, "服务器异常", null);
	 }
    public static SysResult success() {
		 
		 
		 return new SysResult(200, "数据调用成功", null);
	 }
    
    public static SysResult success(Object data) {
		 
		 
		 return new SysResult(200, "数据调用成功", data);
	 }
    public static SysResult success(Object data,String msg) {
		 
		 
		 return new SysResult(200, msg, data);
	 }
}

