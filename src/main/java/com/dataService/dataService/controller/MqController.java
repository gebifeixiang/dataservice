package com.dataService.dataService.controller;

import javax.jms.Queue;
import javax.jms.Topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dataService.dataService.service.MqSendService;


/**
*
* 项目名称：dataService
* 类名称：MqController
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午2:25:42
* 修改人：john
* 修改时间：2018年8月11日 下午2:25:42
* 修改备注：
* @version
*
*/
@RequestMapping("/msg")
@RestController
public class MqController {
	@Autowired
	private Queue personalQueue;
	@Autowired
	private Topic companyTopic;
	@Autowired
	private MqSendService mqSendService;
	
	@RequestMapping("/sendPersonMsg")
	public String sendPersonMsg(@RequestBody String  string){
		
		System.out.println("发送的消息是>>>>"+string);
		mqSendService.sendObject(personalQueue, string);
		return string;
		
	}

}
