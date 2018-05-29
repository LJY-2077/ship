/**  
* @Title: LoginController.java
* @Package com.ship.controller
* @Description: TODO(用一句话描述该文件做什么)
* @author lijingyang   
* @date 2018年5月29日 下午4:41:06
* @version V1.0  
*/
package com.ship.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ship.domain.Admin;

/**
 * @ClassName: LoginController
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author li jingyang
 * @date 2018年5月29日 下午4:41:06
 *
 */
@Controller
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.ship.service" }) // 添加的注解
public class LoginController {

	@RequestMapping("/")
	public String login(Admin admin) {
		return "login";
	}

}
