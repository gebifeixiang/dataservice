package com.dataService.dataService.service.serviceImpl;

import javax.jms.Destination;
import javax.jms.Message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.dataService.dataService.service.MqSendService;

/**
*
* 项目名称：dataService
* 类名称：MqSendServiceImpl
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午2:07:42
* 修改人：john
* 修改时间：2018年8月11日 下午2:07:42
* 修改备注：
* @version
*
*/
@Service
public class MqSendServiceImpl  implements MqSendService{
	@Autowired
	 private JmsMessagingTemplate jmsTemplate;
	//private JmsTemplate jmsTemplate;
	
	
	@Override
	public void sendMsg(Destination destination, String msg) {
		jmsTemplate.convertAndSend(destination, msg);
		//jmsTemplate.convertSendAndReceive(destination, request, , postProcessor)
	}

	
	@Override
	public void sendObject(Destination destination, Object obj) {
		jmsTemplate.convertAndSend(destination,obj);
	}

}
