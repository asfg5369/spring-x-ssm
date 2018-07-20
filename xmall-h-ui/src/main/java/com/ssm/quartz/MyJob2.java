package com.ssm.quartz;

import java.util.Date;

/**
 * author:姜亮;Date:2018/7/19
 */
public class MyJob2 {
	public void doSomething(){
		System.out.println(new Date() + ": job 2 doing something...");
	}
}
