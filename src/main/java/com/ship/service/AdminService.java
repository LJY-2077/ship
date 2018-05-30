/**  
* @Title: AdminService.java
* @Package com.ship.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月29日 下午5:12:40
* @version V1.0  
*/ 
package com.ship.service;

import com.ship.domain.Admin;

/**
* @ClassName: AdminService
* @Description: TODO(这里用一句话描述这个类的作用)
* @author li jingyang  
* @date 2018年5月29日 下午5:12:40
*
*/
public interface AdminService {

	/**
	* @Title: findByPro
	* @Description: TODO(这里用一句话描述这个方法的作用)
	* @param @param admin
	* @param @return    设定文件
	* @return Admin    返回类型
	* @throws
	*/ 
	Admin findByPro(Admin admin);

}
