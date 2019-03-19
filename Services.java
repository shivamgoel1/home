package com.cts.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medicare_services_table")
public class Services {
	
	public Services() {
		
	}
	
	@Id
	@Column(name="Medicare_Service_Id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int medicare_service_id;
	
	@Column(name="Medicare_Service",length=50)
	String medicare_service;	
	
	@Column(name="Service_Description",length=200)
	String Service_Description;
	
	@Column(name="Amount",length=10)
	int amount;

	public Services(int medicare_service_id, String medicare_service, String service_Description, int amount) {
		super();
		this.medicare_service_id = medicare_service_id;
		this.medicare_service = medicare_service;
		Service_Description = service_Description;
		this.amount = amount;
	}

	public int getMedicare_service_id() {
		return medicare_service_id;
	}

	public void setMedicare_service_id(int medicare_service_id) {
		this.medicare_service_id = medicare_service_id;
	}

	public String getMedicare_service() {
		return medicare_service;
	}

	public void setMedicare_service(String medicare_service) {
		this.medicare_service = medicare_service;
	}

	public String getService_Description() {
		return Service_Description;
	}

	public void setService_Description(String service_Description) {
		Service_Description = service_Description;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Services [medicare_service_id=" + medicare_service_id + ", medicare_service=" + medicare_service
				+ ", Service_Description=" + Service_Description + ", amount=" + amount + "]";
	}
	
	
	
}
