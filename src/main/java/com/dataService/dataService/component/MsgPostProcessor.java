package com.dataService.dataService.component;

import javax.jms.JMSException;
import javax.jms.Message;

import org.springframework.jms.core.MessagePostProcessor;

/**
*
* 项目名称：dataService
* 类名称：MsgPostProcessor
* 类描述：
* 创建人：john
* 创建时间：2018年8月11日 下午6:28:26
* 修改人：john
* 修改时间：2018年8月11日 下午6:28:26
* 修改备注：
* @version
*
*/
public class MsgPostProcessor implements MessagePostProcessor {

	
	@Override
	public Message postProcessMessage(Message message) throws JMSException {
		  message.setStringProperty("requiresReply", "yes");
		    return message;
	}

	


}
