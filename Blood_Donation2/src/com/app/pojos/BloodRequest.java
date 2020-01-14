package com.app.pojos;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "blood_request")
public class BloodRequest 
{
	private Integer req_id;
	private User requster_id;//fk
	private String blood_group;
	private double requsted_qty;
	private Date require_date;
	private String request_msg;
	
	public BloodRequest() {
		// TODO Auto-generated constructor stub
	}


	public BloodRequest(User requster_id, String blood_group, double requsted_qty, Date require_date,
			String request_msg) {
		super();
		this.requster_id = requster_id;
		this.blood_group = blood_group;
		this.requsted_qty = requsted_qty;
		this.require_date = require_date;
		this.request_msg = request_msg;
	}


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getReq_id() {
		return req_id;
	}

	public void setReq_id(Integer req_id) {
		this.req_id = req_id;
	}

	@ManyToOne
	@JoinColumn(name = "requster_id")
	public User getRequster_id() {
		return requster_id;
	}

	public void setRequster_id(User requster_id) {
		this.requster_id = requster_id;
	}

	public double getRequsted_qty() {
		return requsted_qty;
	}

	public void setRequsted_qty(double requsted_qty) {
		this.requsted_qty = requsted_qty;
	}

	@Temporal(TemporalType.DATE)
	public Date getRequire_date() {
		return require_date;
	}

	public void setRequire_date(Date require_date) {
		this.require_date = require_date;
	}

	public String getRequest_msg() {
		return request_msg;
	}

	public void setRequest_msg(String request_msg) {
		this.request_msg = request_msg;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}
	
	
}
