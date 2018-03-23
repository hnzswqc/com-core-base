package com.core.base.exception;

/**
 * 
 * 项目名称: com.core.base <br/>
 * 文件名称: DAOException.java <br/>
 * 描述信息:  DAO层出现异常时，通过此异常类进行异常抛出 <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午11:23:12 <br/>
 */
public class DAOException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7951174920316808764L;

	public DAOException() {  
        super();  
    }  
  
    public DAOException(String msg) {  
        super(msg);  
    }  
  
    public DAOException(Throwable e) {  
        super(e);  
    }  
  
    public DAOException(String msg, Throwable e) {  
        super(msg, e);  
    }  
}
