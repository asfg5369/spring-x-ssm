package com.ssm.quartz;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class MyJob1 implements Job {
	public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
		System.out.println(new Date() + ": job 1 doing something...");
	}

}
