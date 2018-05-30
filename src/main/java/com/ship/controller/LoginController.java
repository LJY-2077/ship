/**  
* @Title: LoginController.java
* @Package com.ship.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月29日 下午4:41:06
* @version V1.0  
*/
package com.ship.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ship.domain.Admin;
import com.ship.service.AdminService;

/**
 * @ClassName: LoginController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月29日 下午4:41:06
 *
 */
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ship" }) // 添加的注解
public class LoginController {

	@Autowired
	private AdminService adminService;

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/index")
	public String index() {

		return "index";
	}

	@RequestMapping("/userLogin")
	@ResponseBody
	public Admin userLogin(HttpServletRequest request, Admin admin) {
		Admin ad = adminService.findByPro(admin);

		if (ad != null) {
			request.getSession().setAttribute("admin", ad);
			return ad;
		} else {
			return null;
		}
	}


}
