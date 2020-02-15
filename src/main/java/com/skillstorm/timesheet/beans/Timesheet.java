package com.skillstorm.timesheet.beans;

import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "TIMESHEET")

public class Timesheet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "TIMESHEET_ID")
	@JsonProperty(value = "timesheetId")
	private int timesheetId;
	
	@Column(name = "USER_NAME")
	@JsonProperty(value = "username")
	private String userName;
	
	@Column(name = "MON_HOURS")
	@JsonProperty(value = "mondayHours")	
	private float mondayHours;
	
	@Column(name = "TUES_HOURS")
	@JsonProperty(value = "tuesdayHours")
	private float tuesdayHours;
	
	@Column(name = "WEDS_HOURS")
	@JsonProperty(value = "wednesdayHours")
	private float wednesdayHours;
	
	@Column(name = "THURS_HOURS")
	@JsonProperty(value = "thursdayHours")
	private float thursdayHours;
	
	@Column(name = "FRIDAY_HOURS")
	@JsonProperty(value = "fridayHours")
	private float fridayHours;
	
	@Column(name = "SATURDAY_HOURS")
	@JsonProperty(value = "saturdayHours")
	private float saturdayHours;
	
	@Column(name = "SUNDAY_HOURS")
	@JsonProperty(value = "sundayHours")
	private float sundayHours;
	
	@Column(name = "STATUS_ID")
	@JsonIgnore(value = true)
	private int statusId;
	
	@Column(name = "WEEKEND_DATE")
	@JsonProperty(value = "weekEndDate")
	private String weekEndDate;

	@CreationTimestamp
	private LocalDateTime createDateTime;
	
	@UpdateTimestamp
	private LocalDateTime updateDateTime;
	
	@ManyToOne
	@JoinColumn(name = "USER_ID")
	@JsonIgnore
	private User user;

	
	public Timesheet() {
		super();
		
	}

	public Timesheet(int timesheetId, String userName, float mondayHours, float tuesdayHours, float wednesdayHours,
			float thursdayHours, float fridayHours, float saturdayHours, float sundayHours, int statusId,
			String weekEndDate, LocalDateTime createDateTime, LocalDateTime updateDateTime, User user) {
		super();
		this.timesheetId = timesheetId;
		this.userName = userName;
		this.mondayHours = mondayHours;
		this.tuesdayHours = tuesdayHours;
		this.wednesdayHours = wednesdayHours;
		this.thursdayHours = thursdayHours;
		this.fridayHours = fridayHours;
		this.saturdayHours = saturdayHours;
		this.sundayHours = sundayHours;
		this.statusId = statusId;
		this.weekEndDate = weekEndDate;
		this.createDateTime = createDateTime;
		this.updateDateTime = updateDateTime;
		this.user = user;
	}

	public int getTimesheetId() {
		return timesheetId;
	}

	public void setTimesheetId(int timesheetId) {
		this.timesheetId = timesheetId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public float getMondayHours() {
		return mondayHours;
	}

	public void setMondayHours(float mondayHours) {
		this.mondayHours = mondayHours;
	}

	public float getTuesdayHours() {
		return tuesdayHours;
	}

	public void setTuesdayHours(float tuesdayHours) {
		this.tuesdayHours = tuesdayHours;
	}

	public float getWednesdayHours() {
		return wednesdayHours;
	}

	public void setWednesdayHours(float wednesdayHours) {
		this.wednesdayHours = wednesdayHours;
	}

	public float getThursdayHours() {
		return thursdayHours;
	}

	public void setThursdayHours(float thursdayHours) {
		this.thursdayHours = thursdayHours;
	}

	public float getFridayHours() {
		return fridayHours;
	}

	public void setFridayHours(float fridayHours) {
		this.fridayHours = fridayHours;
	}

	public float getSaturdayHours() {
		return saturdayHours;
	}

	public void setSaturdayHours(float saturdayHours) {
		this.saturdayHours = saturdayHours;
	}

	public float getSundayHours() {
		return sundayHours;
	}

	public void setSundayHours(float sundayHours) {
		this.sundayHours = sundayHours;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public String getWeekEndDate() {
		return weekEndDate;
	}

	public void setWeekEndDate(String weekEndDate) {
		this.weekEndDate = weekEndDate;
	}

	public LocalDateTime getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(LocalDateTime createDateTime) {
		this.createDateTime = createDateTime;
	}

	public LocalDateTime getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDateTime updateDateTime) {
		this.updateDateTime = updateDateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Timesheet [timesheetId=" + timesheetId + ", userName=" + userName + ", mondayHours=" + mondayHours
				+ ", tuesdayHours=" + tuesdayHours + ", wednesdayHours=" + wednesdayHours + ", thursdayHours="
				+ thursdayHours + ", fridayHours=" + fridayHours + ", saturdayHours=" + saturdayHours + ", sundayHours="
				+ sundayHours + ", statusId=" + statusId + ", weekEndDate=" + weekEndDate + ", createDateTime="
				+ createDateTime + ", updateDateTime=" + updateDateTime + ", user=" + user + "]";
	}
	

	
	
	
	

}
