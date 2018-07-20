package cn.xmall.quartz;

import com.ssm.quartz.QuartzManager;
import org.junit.Test;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * author:姜亮;Date:2018/7/19
 */
public class JobTest1 {

	public static void main(String[] args) throws BeansException {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("classpath:spring-quartz.xml");
		QuartzManager quartzManager = (QuartzManager)ctx.getBean("quartzManager");
		try {
			System.out.println("【系统启动】开始(每1秒输出一次)...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Test
	public void test1(){
		System.out.println("-------------test1---------");
	}
}
