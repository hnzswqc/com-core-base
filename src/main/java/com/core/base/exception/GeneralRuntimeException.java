package com.core.base.exception;

/**
 * 
 * 项目名称: com.core.base <br/>
 * 文件名称: GeneralRuntimeException.java <br/>
 * 描述信息: 系统异常类s  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午11:25:20 <br/>
 */
public class GeneralRuntimeException extends RuntimeException {
	private static final long serialVersionUID = 1L;
    
    public GeneralRuntimeException(String message) {
    	super(message);
    }
	
    public GeneralRuntimeException(String message, Throwable ex) {
    	super(message, ex);
    }
    
    public GeneralRuntimeException(Throwable ex) {
    	super(ex);
    } 
}
