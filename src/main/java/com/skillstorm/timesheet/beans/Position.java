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
@Table(name = "POSITION")
public class Position {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "POSITION_ID")
	@JsonProperty(value = "positionId")
	private int positionId;
	
	@Column(name = "POSITION")
	@JsonProperty(value = "position")
	private String position;
	
	@Column(name = "APPROVED")
	@JsonIgnore(value = true)
	private boolean approval;

	@OneToOne
	@JoinColumn(name = "USER_ID")
	private User user;
	
	public Position() {
		super();

	}

	public Position(int positionId, String position, boolean approval, User user, Set<Timesheet> timesheet) {
		super();
		this.positionId = positionId;
		this.position = position;
		this.approval = approval;
		this.user = user;
		
	}


	public int getPositionId() {
		return positionId;
	}

	public void setPositionId(int positionId) {
		this.positionId = positionId;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public boolean isApproval() {
		return approval;
	}

	public void setApproval(boolean approval) {
		this.approval = approval;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Position [positionId=" + positionId + ", position=" + position + ", approval=" + approval + ", user="
				+ user + "]";
	}

	
	
	
}
