/*
package com.ssm.controller;

import com.ssm.service.ConsumerService;
import com.ssm.service.ProducerService;
import com.ssm.utils.XmallResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.TextMessage;

*/
/**
 * author:姜亮;Date:2018/7/12
 *//*

//@Controller
public class MessageController {
	private Logger logger = LoggerFactory.getLogger(MessageController.class);
	@Resource(name = "activeMQQueueDestination")
	private Destination destination;
	//队列消息生产者
	@Autowired
	private ProducerService producer;
	//队列消息消费者
	@Autowired
	private ConsumerService consumer;

	@RequestMapping(value = "/SendMessage/{msg}", method = RequestMethod.GET)
	@ResponseBody
	public XmallResult send(@PathVariable String msg) {
		logger.info(Thread.currentThread().getName() + "------------send to jms Start");
		producer.sendMessage(msg);
		logger.info(Thread.currentThread().getName() + "------------send to jms End");
		System.out.println("msg:"+msg);
		return XmallResult.ok(msg);
	}

	@RequestMapping(value = "/ReceiveMessage", method = RequestMethod.GET)
	@ResponseBody
	public Object receive() {
		logger.info(Thread.currentThread().getName() + "------------receive from jms Start");
		TextMessage tm = consumer.receive(destination);
		logger.info(Thread.currentThread().getName() + "------------receive from jms End");
		return tm;
	}
}
*/
