/*
 * 项目名称: com.core.base
 * 文件 名称: BaseController.java
 * 创建时间: 2018年3月23日 上午10:21:02  
 * 版本号:  V1.0
 * 开发单位: 北京学汇教育科技股份公司-研发部
 */
package com.core.base.controller.impl;

import java.io.Serializable;

import com.core.base.controller.IBaseController;
import com.core.base.model.AjaxJson;
import com.core.base.model.BaseModel;
import com.core.base.service.IBaseService;

/**    
 * 项目名称: com.core.base <br/>
 * 文件名称: BaseController.java <br/>
 * 描述信息: controller基础实现类，T为实体对象  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午10:21:02 <br/>
 */
public class BaseController<T extends BaseModel,PK extends Serializable> implements IBaseController<T,PK>{
	/**
	 * 业务注入
	 */
	private IBaseService<T,PK> baseService = null;
	
	/**
	 * 设置实际要进行操作的业务类
	 * @param baseMapper the baseMapper to set
	 */
	public void setBaseService(IBaseService<T,PK> baseService) {
		this.baseService = baseService;
	}


	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#add(com.core.base.model.BaseModel)
	 */
	@Override
	public AjaxJson add(T t) {
		boolean result = baseService.insert(t);
		return result?new AjaxJson(SUCCESS, t,MSG_SUCCESS):new AjaxJson(FAIL, t,MSG_FAIL);
	}

	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#addSelective(com.core.base.model.BaseModel)
	 */
	@Override
	public AjaxJson addSelective(T t) {
		boolean result = baseService.insertSelective(t);
		return result?new AjaxJson(SUCCESS, t,MSG_SUCCESS):new AjaxJson(FAIL, t,MSG_FAIL);
	}

	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#delete(java.io.Serializable)
	 */
	@Override
	public AjaxJson delete(PK pk) {
		boolean result = baseService.deleteByPrimaryKey(pk);
		return result?new AjaxJson(SUCCESS, pk,MSG_SUCCESS):new AjaxJson(FAIL,pk,MSG_FAIL);
	}

	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#getByPrimaryKey(java.io.Serializable)
	 */
	@Override
	public AjaxJson getByPrimaryKey(PK pk) {
		T t = baseService.selectByPrimaryKey(pk);
		return null!=t?new AjaxJson(SUCCESS, t,MSG_SUCCESS):new AjaxJson(FAIL,t,MSG_FAIL);
	}

	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#update(com.core.base.model.BaseModel)
	 */
	@Override
	public AjaxJson update(T t) {
		boolean result = baseService.updateByPrimaryKey(t);
		return result?new AjaxJson(SUCCESS, t,MSG_SUCCESS):new AjaxJson(FAIL,t,MSG_FAIL);
	}

	/* (non-Javadoc)
	 * @see com.core.base.controller.IBaseController#updateByPrimaryKeySelective(com.core.base.model.BaseModel)
	 */
	@Override
	public AjaxJson updateByPrimaryKeySelective(T t) {
		boolean result = baseService.updateByPrimaryKeySelective(t);
		return result?new AjaxJson(SUCCESS, t,MSG_SUCCESS):new AjaxJson(FAIL,t,MSG_FAIL);
	}
	
	
}
