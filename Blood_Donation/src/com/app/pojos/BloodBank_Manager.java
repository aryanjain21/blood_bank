package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "bank_manager")
public class BloodBank_Manager 
{
	private Integer m_id;
	private String bloodBank_name;
	private User uid;//fk
	
	public BloodBank_Manager() {
		// TODO Auto-generated constructor stub
	}

	public BloodBank_Manager(String bloodBank_name, User uid) {
		super();
		this.bloodBank_name = bloodBank_name;
		this.uid = uid;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getM_id() {
		return m_id;
	}

	public void setM_id(Integer m_id) {
		this.m_id = m_id;
	}

	public String getBloodBank_name() {
		return bloodBank_name;
	}

	public void setBloodBank_name(String bloodBank_name) {
		this.bloodBank_name = bloodBank_name;
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
