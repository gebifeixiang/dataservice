package com.dataService.dataService.component;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

/**
 *
 * 项目名称：dataService 类名称：MqBeans 类描述： 创建人：john 创建时间：2018年8月11日 下午2:13:49 修改人：john
 * 修改时间：2018年8月11日 下午2:13:49 修改备注：
 * 
 * @version
 *
 */
@Configuration
@EnableJms
public class MqBeans {
	@Value("${queque.personal}")
	private String personalQueue;
	@Value("${topic.company}")
	private String company;
	
	

	@Bean
	public Queue personalQueue() {
		return new ActiveMQQueue(personalQueue);
	}

	@Bean
	public Topic company1Topic() {
		return new ActiveMQTopic(company);
	}
	




	/*@Bean
	public JmsListenerContainerFactory<?> jmsListenerContainerTopic(ActiveMQConnectionFactory connectionFactory) {
		DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
		bean.setPubSubDomain(true);
		bean.setConnectionFactory(connectionFactory);
		System.out.println("注入的connectionFactory>>>>>" + connectionFactory.getUserName());
		return bean;
	}

	@Bean
	public JmsListenerContainerFactory<?> jmsListenerContainerQueue(ActiveMQConnectionFactory connectionFactory) {
		DefaultJmsListenerContainerFactory bean = new DefaultJmsListenerContainerFactory();
		bean.setConnectionFactory(connectionFactory);
		bean.setPubSubDomain(false);
		return bean;
	}*/

}
