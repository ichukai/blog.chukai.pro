package com.chulung.blog.quartz.job;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.chulung.blog.enumerate.LogLevel;
import com.chulung.blog.enumerate.LogType;
import com.chulung.blog.mapper.AppLogMapper;
import com.chulung.blog.model.AppLog;

public abstract class CronJob {

	@Autowired
	private AppLogMapper cronJobLogMapper;

	public void mainHandler() {
		Component component=this.getClass().getAnnotation(Component.class);
		cronJobLogMapper.insertSelective(new AppLog(LogType.CRON_JOB_LOG, LogLevel.INFO,component!=null?component.value()+" starting":"", LocalDateTime.now()));
		try {
			execute();
		} catch (Exception e) {
		}
	}

	public abstract void execute();
}