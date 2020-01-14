package com.app.pojos;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "camp_details")
public class Camp 
{
	private Integer camp_id;
	private User organizer_id;//fk
	private double blood_amount;
	private String camp_venue;
	private Date camp_date;
	
	public Camp() {
		// TODO Auto-generated constructor stub
	}

	public Camp(User organizer_id, double blood_amount, String camp_venue, Date camp_date) {
		super();
		this.organizer_id = organizer_id;
		this.blood_amount = blood_amount;
		this.camp_venue = camp_venue;
		this.camp_date = camp_date;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getCamp_id() {
		return camp_id;
	}

	public void setCamp_id(Integer camp_id) {
		this.camp_id = camp_id;
	}

	@OneToOne
	@JoinColumn(name = "organizer_id")
	public User getOrganizer_id() {
		return organizer_id;
	}

	public void setOrganizer_id(User organizer_id) {
		this.organizer_id = organizer_id;
	}

	public double getBlood_amount() {
		return blood_amount;
	}

	public void setBlood_amount(double blood_amount) {
		this.blood_amount = blood_amount;
	}

	public String getCamp_venue() {
		return camp_venue;
	}

	public void setCamp_venue(String camp_venue) {
		this.camp_venue = camp_venue;
	}

	@Temporal(TemporalType.DATE)
	public Date getCamp_date() {
		return camp_date;
	}

	public void setCamp_date(Date camp_date) {
		this.camp_date = camp_date;
	}
	
	
	
}
