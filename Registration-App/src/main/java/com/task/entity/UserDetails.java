package com.task.entity;

import jakarta.persistence.Table;

@Entity
@Table(name = "USER_DTLS")
public class UserDetails {
	private String category;
	private String reproducibility; 
	private String complexity;
	private String assignedTo;
	private String status;
	private String priority;
	private String endDate;
	private String title;
	private String description;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getReproducibility() {
		return reproducibility;
	}
	public void setReproducibility(String reproducibility) {
		this.reproducibility = reproducibility;
	}
	public String getComplexity() {
		return complexity;
	}
	public void setComplexity(String complexity) {
		this.complexity = complexity;
	}
	public String getAssignedTo() {
		return assignedTo;
	}
	public void setAssignedTo(String assignedTo) {
		this.assignedTo = assignedTo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	@Override
	public String toString() {
		return "UserDetails [category=" + category + ", reproducibility=" + reproducibility + ", complexity="
				+ complexity + ", assignedTo=" + assignedTo + ", status=" + status + ", priority=" + priority
				+ ", endDate=" + endDate + ", title=" + title + ", description=" + description + "]";
	}
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserDetails(String category, String reproducibility, String complexity, String assignedTo, String status,
			String priority, String endDate, String title, String description) {
		super();
		this.category = category;
		this.reproducibility = reproducibility;
		this.complexity = complexity;
		this.assignedTo = assignedTo;
		this.status = status;
		this.priority = priority;
		this.endDate = endDate;
		this.title = title;
		this.description = description;
	}
	
	
	
	

}
