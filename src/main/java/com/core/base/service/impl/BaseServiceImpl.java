/*
 * 项目名称: com.core.base
 * 文件 名称: BaseServiceImpl.java
 * 创建时间: 2018年3月23日 上午10:28:42  
 * 版本号:  V1.0
 * 开发单位: 北京学汇教育科技股份公司-研发部
 */
package com.core.base.service.impl;

import java.io.Serializable;

import com.core.base.exception.ServiceException;
import com.core.base.mapper.BaseMapper;
import com.core.base.model.BaseModel;
import com.core.base.service.IBaseService;

/**    
 * 项目名称: com.core.base <br/>
 * 文件名称: BaseServiceImpl.java <br/>
 * 描述信息: service层逻辑处理信息  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午10:28:42 <br/>
 */
public class BaseServiceImpl<T extends BaseModel,PK extends Serializable> implements IBaseService<T, PK> {
	
	/**
	 * mapper注入
	 */
	public BaseMapper<T, PK> baseMapper;
	
	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#insert(com.core.base.model.BaseModel)
	 */
	@Override
	public boolean insert(T t) throws ServiceException{
		return baseMapper.insert(t)>0?true:false;
	}

	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#insertSelective(com.core.base.model.BaseModel)
	 */
	@Override
	public boolean insertSelective(T t) throws ServiceException{
		return baseMapper.insertSelective(t)>0?true:false;
	}

	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#deleteByPrimaryKey(java.io.Serializable)
	 */
	@Override
	public boolean deleteByPrimaryKey(PK pk) throws ServiceException{
		return baseMapper.deleteByPrimaryKey(pk)>0?true:false;
	}

	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#selectByPrimaryKey(java.io.Serializable)
	 */
	@Override
	public T selectByPrimaryKey(PK pk) throws ServiceException{
		return baseMapper.selectByPrimaryKey(pk);
	}

	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#updateByPrimaryKeySelective(com.core.base.model.BaseModel)
	 */
	@Override
	public boolean updateByPrimaryKeySelective(T t) throws ServiceException{
		return baseMapper.updateByPrimaryKeySelective(t)>0?true:false;
	}

	/* (non-Javadoc)
	 * @see com.core.base.service.IBaseService#updateByPrimaryKey(com.core.base.model.BaseModel)
	 */
	@Override
	public boolean updateByPrimaryKey(T t) throws ServiceException{
		return baseMapper.updateByPrimaryKey(t)>0?true:false;
	}

}
