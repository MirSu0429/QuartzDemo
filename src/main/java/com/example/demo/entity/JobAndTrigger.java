package com.example.demo.entity;

import com.baomidou.mybatisplus.activerecord.Model;

import java.io.Serializable;
import java.math.BigInteger;
/**
 * Demo class
 *
 * @author keriezhang
 * @date 2016/10/31
 */
public class JobAndTrigger extends Model<JobAndTrigger> {
	private static final long serialVersionUID = -2071565876962058344L;
	private String jobName;
	private String jobGroup;
	private String jobClassName;
	private String triggerName;
	private String triggerGroup;
	private BigInteger repeatInterval;
	private BigInteger timesTriggered;
	private String cronExpression;
	private String timeZoneId;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobGroup() {
		return jobGroup;
	}

	public void setJobGroup(String jobGroup) {
		this.jobGroup = jobGroup;
	}

	public String getJobClassName() {
		return jobClassName;
	}

	public void setJobClassName(String jobClassName) {
		this.jobClassName = jobClassName;
	}

	public String getTriggerName() {
		return triggerName;
	}

	public void setTriggerName(String triggerName) {
		this.triggerName = triggerName;
	}

	public String getTriggerGroup() {
		return triggerGroup;
	}

	public void setTriggerGroup(String triggerGroup) {
		this.triggerGroup = triggerGroup;
	}

	public BigInteger getRepeatInterval() {
		return repeatInterval;
	}

	public void setRepeatInterval(BigInteger repeatInterval) {
		this.repeatInterval = repeatInterval;
	}

	public BigInteger getTimesTriggered() {
		return timesTriggered;
	}

	public void setTimesTriggered(BigInteger timesTriggered) {
		this.timesTriggered = timesTriggered;
	}

	public String getCronExpression() {
		return cronExpression;
	}

	public void setCronExpression(String cronExpression) {
		this.cronExpression = cronExpression;
	}

	public String getTimeZoneId() {
		return timeZoneId;
	}

	public void setTimeZoneId(String timeZoneId) {
		this.timeZoneId = timeZoneId;
	}

	@Override
	protected Serializable pkVal() {
		return this.timeZoneId;
	}
}
