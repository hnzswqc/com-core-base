/*
 * 项目名称: com.core.base
 * 文件 名称: ServiceException.java
 * 创建时间: 2018年3月23日 上午11:20:01  
 * 版本号:  V1.0
 * 开发单位: 北京学汇教育科技股份公司-研发部
 */
package com.core.base.exception;

/**    
 * 项目名称: com.core.base <br/>
 * 文件名称: ServiceException.java <br/>
 * 描述信息: 业务层出现异常时，通过此异常类进行异常抛出  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午11:20:01 <br/>
 */
public class ServiceException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6816509062418698749L;

	
	public ServiceException() {  
        super();  
    }  
  
    public ServiceException(String msg) {  
        super(msg);  
    }  
  
    public ServiceException(Throwable e) {  
        super(e);  
    }  
	
	public ServiceException(String message,Throwable cause){
		super(message,cause);
	}
}
