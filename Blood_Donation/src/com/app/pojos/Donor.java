package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "donor")
public class Donor {

	private Integer d_id;
	private Integer weight;
	private User uid;//fk

	public Donor() {
		// TODO Auto-generated constructor stub
	}

	public Donor(Integer weight) {
		super();
		this.weight = weight;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getD_id() {
		return d_id;
	}

	public void setD_id(Integer d_id) {
		this.d_id = d_id;
	}
	
	@OneToOne
	@JoinColumn(name = "uid")
	public User getUid() {
		return uid;
	}

	public void setUid(User uid) {
		this.uid = uid;
	}

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	
	
	
}
