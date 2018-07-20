/*
package com.ssm.service.impl;

import com.ssm.service.ConsumerService;
import org.springframework.jms.core.JmsTemplate;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

*/
/**
 * author:姜亮;Date:2018/7/12
 *//*

//@Service
public class ConsumerServiceImpl implements ConsumerService {
	@Resource(name = "jmsTemplate")
	private JmsTemplate jmsTemplate;

	@Override
	public TextMessage receive(Destination destination) {
		TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
		try {
			System.out.println("从队列" + destination.toString() + "收到了消息：\t"
					+ textMessage.getText());
		} catch (JMSException e) {
			e.printStackTrace();
		}
		return textMessage;
	}
}
*/
