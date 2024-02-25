package com.task.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String category;
	private String reproducibility;
	private String complexity;
	private String assignedTo;
	private String status;
	private String priority;
	private String startDate;
	private String endDate;
	private String type;
	private String title;
	private String description;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
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
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String category, String reproducibility, String complexity, String assignedTo, String status,
			String priority, String startDate, String endDate, String type, String title, String description) {
		super();
		this.id = id;
		this.category = category;
		this.reproducibility = reproducibility;
		this.complexity = complexity;
		this.assignedTo = assignedTo;
		this.status = status;
		this.priority = priority;
		this.startDate = startDate;
		this.endDate = endDate;
		this.type = type;
		this.title = title;
		this.description = description;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", category=" + category + ", reproducibility=" + reproducibility + ", complexity="
				+ complexity + ", assignedTo=" + assignedTo + ", status=" + status + ", priority=" + priority
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", type=" + type + ", title=" + title
				+ ", description=" + description + "]";
	}
	
	
	
	
}
