package com.dataService.dataService.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
*
* 项目名称：dataService
* 类名称：PoliceController
* 类描述：
* 创建人：john
* 创建时间：2018年8月10日 下午4:04:02
* 修改人：john
* 修改时间：2018年8月10日 下午4:04:02
* 修改备注：
* @version
*
*/
@RequestMapping("/plice")
@RestController
public class PoliceController {
	@RequestMapping("/getName")
	public String getName(){
		System.out.println("interface  getName方法");
		return "zhansan";
	}

}
