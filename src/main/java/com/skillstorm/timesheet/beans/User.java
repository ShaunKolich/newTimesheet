package com.skillstorm.timesheet.beans;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "USER")

public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "USER_ID")
	@JsonProperty(value = "userId")
	private int userId;
	
	@Column(name = "FIRST_NAME")
	@JsonProperty(value = "firstName")
	private String firstName;
	
	@Column(name = "LAST_NAME")
	@JsonProperty(value = "lastName")
	private String lastName;
	
	@Column(name = "EMAIL")
	@JsonProperty(value = "email")
	private String email;
	
	@Column(name = "PASSWORD")
	@JsonProperty(value = "password")
	private String password;
	
	@Column(name = "USER_NAME")
	@JsonProperty(value = "userName")
	private String userName;

	@OneToMany(mappedBy = "user")
	@JsonProperty(value = "timesheets")
	@JsonIgnore
	private Set<Timesheet> timesheet;
	
	@OneToOne
	@JoinColumn(name = "POSITION_ID")
	private Position position;
	
	public Set<Timesheet> getTimesheet() {
		return timesheet;
	}

	public void setTimesheet(Set<Timesheet> timesheet) {
		this.timesheet = timesheet;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public User() {
		super();
		
	}

	public User(int userId, String firstName, String lastName, String email, String password, String userName,
			Set<Timesheet> timesheet, Position position) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.userName = userName;
		this.timesheet = timesheet;
		this.position = position;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserNanme(String userName) {
		this.userName = userName;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", password=" + password + ", userName=" + userName + ", timesheet=" + timesheet + ", position="
				+ position + "]";
	}

	
	
	
	
}
