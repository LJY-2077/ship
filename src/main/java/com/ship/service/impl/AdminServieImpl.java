/**  
* @Title: AdminServieImpl.java
* @Package com.ship.service.impl
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月29日 下午5:13:13
* @version V1.0  
*/
package com.ship.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ship.common.mapper.ext.AdminAMapper;
import com.ship.domain.Admin;
import com.ship.service.AdminService;

/**
 * @ClassName: AdminServieImpl
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月29日 下午5:13:13
 *
 */
@Service
public class AdminServieImpl implements AdminService {
	
	@Autowired 
	private AdminAMapper adminAMapper;

	/* (非 Javadoc)
	* <p>Title: findByPro</p>
	* <p>Description: </p>
	* @param admin
	* @return
	* @see com.ship.service.AdminService#findByPro(com.ship.domain.Admin)
	*/ 
	@Override
	public Admin findByPro(Admin admin) {
		// TODO Auto-generated method stub
		return adminAMapper.findByPro(admin);
	}

}
