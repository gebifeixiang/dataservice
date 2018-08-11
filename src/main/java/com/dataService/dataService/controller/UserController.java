package com.dataService.dataService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataService.dataService.entity.User;
import com.dataService.dataService.service.UserService;

/**
*
* 项目名称：dataService
* 类名称：UserController
* 类描述：
* 创建人：john
* 创建时间：2018年8月10日 下午5:13:48
* 修改人：john
* 修改时间：2018年8月10日 下午5:13:48
* 修改备注：
* @version
*
*/
@RequestMapping("/user")
@RestController
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/selectUserById")
	public User selectUserById(){
		Integer id=1;
		return userService.selectUserById(id);
	}
	

}
