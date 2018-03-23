package com.core.base.model;

/**
 * 
 * 项目名称: com.core.base <br/>
 * 文件名称: AjaxJson.java <br/>
 * 描述信息: $.ajax后需要接受的JSON  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午11:33:07 <br/>
 */
public class AjaxJson {

	/**
	 * 默认构造函数
	 */
	public AjaxJson(){}
	
	/**
	 * 带操作状态构造函数
	 * @param success
	 */
	public AjaxJson(boolean success){
		this.success = success;
	}
	
	/**
	 * 带操作状态、返回数据的构造函数
	 * @param success
	 * @param data
	 */
	public AjaxJson(boolean success,Object data){
		this.success = success;
		this.data = data;
	}
	/**
	 * 带操作状态、返回数据的构造函数
	 * @param success
	 * @param data
	 */
	public AjaxJson(boolean success,String msg){
		this.success = success;
		this.msg = msg;
	}
	
	/**
	 * 带操作状态、返回数据的构造函数
	 * @param success
	 * @param data
	 */
	public AjaxJson(boolean success,Object data,String msg){
		this.success = success;
		this.data = data;
		this.msg = msg;
	}
	
	private boolean success = true;// 是否成功
	
	private String msg = "操作成功";// 提示信息
	
	private Object data = null;// 其他信息
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}
}
