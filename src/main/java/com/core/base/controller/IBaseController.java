/*
 * 项目名称: com.core.base
 * 文件 名称: IBaseController.java
 * 创建时间: 2018年3月23日 上午10:20:09  
 * 版本号:  V1.0
 * 开发单位: 北京学汇教育科技股份公司-研发部
 */
package com.core.base.controller;

import java.io.Serializable;

import com.core.base.model.AjaxJson;
import com.core.base.model.BaseModel;

/**    
 * 项目名称: com.core.base <br/>
 * 文件名称: IBaseController.java <br/>
 * 描述信息: controller层接口，T为实体对象  <br/>
 * 版本号: 1.0 <br/>
 * @author King  <br/>
 * @createTime 2018年3月23日 上午10:20:09 <br/>
 */
public abstract interface IBaseController<T extends BaseModel,PK extends Serializable> {

	/**成功状态*/
	final boolean SUCCESS=true;
	/**失败状态*/
	final boolean FAIL=false;
	/**成功信息*/
	final String MSG_SUCCESS="操作成功";
	/**失败信息*/
	final String MSG_FAIL="操作失败";
	
	
	/**
	 * 
	 * 方法描述: 插入一条记录<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:47:45<br/>
	 */
	abstract AjaxJson add(T t);
	
	/**
	 * 
	 * 方法描述:根据字段插入一条记录 <br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:48:12<br/>
	 */
	abstract AjaxJson addSelective(T t);
	
	
	/**
	 * 
	 * 方法描述:根据主键删除一条记录 <br/> 
	 * @param pk 主键<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:49:37<br/>
	 */
	abstract AjaxJson delete(PK pk);

	/**
	 * 
	 * 方法描述: 根据主键查询一条记录<br/> 
	 * @param pk 主键<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:50:16<br/>
	 */
	abstract AjaxJson getByPrimaryKey(PK pk);

	/**
	 * 
	 * 方法描述: 修改一条信息<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:50:45<br/>
	 */
	abstract AjaxJson update(T t);

	/**
	 * 
	 * 方法描述: 根据字段修改一条信息<br/> 
	 * @param t 实体对象<br/>   
	 * @return <br/>   
	 * @version   1.0<br/> 
	 * @author King   <br/>  
	 * @createTime 2018年3月23日 上午10:51:14<br/>
	 */
	abstract AjaxJson updateByPrimaryKeySelective(T t);

	
}
