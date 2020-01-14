package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "stock_details")
public class StockDetails
{
	private Integer bloodbag_id;
	private String blood_group;
	private double blood_amt;
	private Date rec_date;
	private Date expire_date;
	private User mgr_id;//fk
	
	public StockDetails() {
		// TODO Auto-generated constructor stub
	}

	public StockDetails(String blood_group, double blood_amt, Date rec_date, Date expire_date, User m_id) {
		super();
		this.blood_group = blood_group;
		this.blood_amt = blood_amt;
		this.rec_date = rec_date;
		this.expire_date = expire_date;
		this.mgr_id = m_id;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getBloodbag_id() {
		return bloodbag_id;
	}

	public void setBloodbag_id(Integer bloodbag_id) {
		this.bloodbag_id = bloodbag_id;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public double getBlood_amt() {
		return blood_amt;
	}

	public void setBlood_amt(double blood_amt) {
		this.blood_amt = blood_amt;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "recieve_date")
	public Date getRec_date() {
		return rec_date;
	}

	public void setRec_date(Date rec_date) {
		this.rec_date = rec_date;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "expire_date")
	public Date getExpire_date() {
		return expire_date;
	}

	public void setExpire_date(Date expire_date) {
		this.expire_date = expire_date;
	}

	@OneToOne
	@JoinColumn(name = "mgr_id")
	public User getM_id() {
		return mgr_id;
	}

	public void setM_id(User m_id) {
		this.mgr_id = m_id;
	}

	
	
	
	
}
