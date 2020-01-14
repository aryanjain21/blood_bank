package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "patient")
public class Patient 
{
	private Integer p_id;
	private String pName;
	private String blood_group;
	private Integer req_qty;
	private String pContact;
	private String hospital_name;
	private String hospital_address;
	private String hContact;
	private Date required_date;
	private String request_message;
	private User uid;
	
	public Patient() {
System.out.println("Patient instantiated");
}

	public Patient(String pName, String blood_group, Integer req_qty, String pContact, String hospital_name,
			String hospital_address, String hContact, Date required_date, String request_message) {
		super();
		this.pName = pName;
		this.blood_group = blood_group;
		this.req_qty = req_qty;
		this.pContact = pContact;
		this.hospital_name = hospital_name;
		this.hospital_address = hospital_address;
		this.hContact = hContact;
		this.required_date = required_date;
		this.request_message = request_message;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getP_id() {
		return p_id;
	}

	public void setP_id(Integer p_id) {
		this.p_id = p_id;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public Integer getReq_qty() {
		return req_qty;
	}

	public void setReq_qty(Integer req_qty) {
		this.req_qty = req_qty;
	}

	public String getpContact() {
		return pContact;
	}

	public void setpContact(String pContact) {
		this.pContact = pContact;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public String getHospital_address() {
		return hospital_address;
	}

	public void setHospital_address(String hospital_address) {
		this.hospital_address = hospital_address;
	}

	public String gethContact() {
		return hContact;
	}

	public void sethContact(String hContact) {
		this.hContact = hContact;
	}

	public Date getRequired_date() {
		return required_date;
	}

	public void setRequired_date(Date required_date) {
		this.required_date = required_date;
	}

	public String getRequest_message() {
		return request_message;
	}

	public void setRequest_message(String request_message) {
		this.request_message = request_message;
	}

	@OneToOne
	@JoinColumn(name = "uid")
	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
	}
	
	
	
	
}
