package com.dataService.dataService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataService.dataService.entity.Entity;
import com.dataService.dataService.service.CityESService;

/**
*
* 项目名称：dataService
* 类名称：ESController
* 类描述：
* 创建人：john
* 创建时间：2018年8月12日 下午10:52:27
* 修改人：john
* 修改时间：2018年8月12日 下午10:52:27
* 修改备注：
* @version
*
*/
@RequestMapping("/es")
@RestController
public class ESController {
	@Autowired
	private CityESService cityESService;
	@RequestMapping("/saveEntity")
	public String saveEntity(){
		Entity entity=new Entity();
		entity.setId(1L);
		entity.setName("es");
		
		cityESService.saveEntity(entity);
		
		 return "success";
		
	}

}
