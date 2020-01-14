package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "donation")
public class Donation {
	
	private Integer donate_id;//pk
	private Integer blood_amount;
	private Date donate_date;
	private boolean hepatitsB, hiv, malaria, hepatitsC;
	
	public Donation() {
		// TODO Auto-generated constructor stub
	}

	public Donation(Integer blood_amount, Date donate_date, boolean hepatitsB, boolean hiv, boolean malaria,
			boolean hepatitsC) {
		super();
		this.blood_amount = blood_amount;
		this.donate_date = donate_date;
		this.hepatitsB = hepatitsB;
		this.hiv = hiv;
		this.malaria = malaria;
		this.hepatitsC = hepatitsC;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getDonate_id() {
		return donate_id;
	}

	public void setDonate_id(Integer donate_id) {
		this.donate_id = donate_id;
	}

	public Integer getBlood_amount() {
		return blood_amount;
	}

	public void setBlood_amount(Integer blood_amount) {
		this.blood_amount = blood_amount;
	}

	public Date getDonate_date() {
		return donate_date;
	}

	public void setDonate_date(Date donate_date) {
		this.donate_date = donate_date;
	}

	public boolean isHepatitsB() {
		return hepatitsB;
	}

	public void setHepatitsB(boolean hepatitsB) {
		this.hepatitsB = hepatitsB;
	}

	public boolean isHiv() {
		return hiv;
	}

	public void setHiv(boolean hiv) {
		this.hiv = hiv;
	}

	public boolean isMalaria() {
		return malaria;
	}

	public void setMalaria(boolean malaria) {
		this.malaria = malaria;
	}

	public boolean isHepatitsC() {
		return hepatitsC;
	}

	public void setHepatitsC(boolean hepatitsC) {
		this.hepatitsC = hepatitsC;
	}
	
	

}
