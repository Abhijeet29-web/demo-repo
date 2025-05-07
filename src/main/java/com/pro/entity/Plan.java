package com.pro.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Plan 
{

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	private String name;
	private double price;
	private String billingInterval; //monthly /yearly
	private int billingCycle; //number of renewals
	private int freeTrialDays;
	private double setupFree;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getBillingInterval() {
		return billingInterval;
	}
	public void setBillingInterval(String billingInterval) {
		this.billingInterval = billingInterval;
	}
	public int getBillingCycle() {
		return billingCycle;
	}
	public void setBillingCycle(int billingCycle) {
		this.billingCycle = billingCycle;
	}
	public int getFreeTrialDays() {
		return freeTrialDays;
	}
	public void setFreeTrialDays(int freeTrialDays) {
		this.freeTrialDays = freeTrialDays;
	}
	public double getSetupFree() {
		return setupFree;
	}
	public void setSetupFree(double setupFree) {
		this.setupFree = setupFree;
	}
	
	
	
}
