/*
 * 项目名称: com.core.base
 * 文件 名称: BaseMapper.java
 * 创建时间: 2018年3月23日 上午10:35:12  
 * 版本号:  V1.0
 * 开发单位: 北京学汇教育科技股份公司-研发部
 */
package com.core.base.mapper;

import java.io.Serializable;

import com.core.base.exception.DAOException;
import com.core.base.exception.ServiceException;
import com.core.base.model.BaseModel;

/**    
 * 项目名称: com.core.base <br/>
 * 文件名称: BaseMapper.java <br/>
 * 描述信息: 基础mapper,T为实体对象，PK为相关主键 <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午10:35:12 <br/>
 */
public abstract interface BaseMapper<T extends BaseModel,PK extends Serializable> {
	
	/**
	 * 
	 * 方法描述: 插入一条记录<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:47:45<br/>
	 */
	abstract int insert(T t) throws DAOException;
	
	/**
	 * 
	 * 方法描述:根据字段插入一条记录 <br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:48:12<br/>
	 */
	abstract int insertSelective(T t) throws ServiceException;
	
	
	/**
	 * 
	 * 方法描述:根据主键删除一条记录 <br/> 
	 * @param pk 主键<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:49:37<br/>
	 */
	abstract int deleteByPrimaryKey(PK pk) throws ServiceException;

	/**
	 * 
	 * 方法描述: 根据主键查询一条记录<br/> 
	 * @param pk 主键<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:50:16<br/>
	 */
	abstract T selectByPrimaryKey(PK pk) throws ServiceException;

	/**
	 * 
	 * 方法描述: 根据字段修改一条信息<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:50:45<br/>
	 */
	abstract int updateByPrimaryKeySelective(T t) throws ServiceException;

	/**
	 * 
	 * 方法描述: 修改一条信息<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:51:14<br/>
	 */
	abstract int updateByPrimaryKey(T t) throws ServiceException;
    
	
}
