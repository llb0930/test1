package com.jt.aop;

import org.quartz.ExecuteInJTATransaction;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.jt.vo.SysResult;

@RestControllerAdvice  //定义为全局异常处理  机制
public class RuntimeAop {
   //从当前aop拦截的异常类型
	@ExceptionHandler(RuntimeException.class)
	public  SysResult runtime(Exception exception) {
	  
	  exception.printStackTrace(); //输出异常信息
	  return SysResult.fail();
  }
}
