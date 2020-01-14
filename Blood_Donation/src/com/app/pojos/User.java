package com.app.pojos;

import java.util.Arrays;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name = "user")
public class User 
{
	private Integer u_id;
	private String fName, lName, email, password;
	private Date u_dob;
	private String contact;
	private byte[] image;
	private String blood_group;
	private String gender;
	private Role u_role;
	private Address addr;//user has a address

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(String fName, String lName, String email, String password, Date u_dob, String contact, byte[] image,
			String blood_group, String gender, Role u_role) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.u_dob = u_dob;
		this.contact = contact;
		this.image = image;
		this.blood_group = blood_group;
		this.gender = gender;
		this.u_role = u_role;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "uid")
	public Integer getU_id() {
		return u_id;
	}

	public void setU_id(Integer u_id) {
		this.u_id = u_id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Column(length = 20, unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(length = 15)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getU_dob() {
		return u_dob;
	}

	public void setU_dob(Date u_dob) {
		this.u_dob = u_dob;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Enumerated(EnumType.STRING)
	@Column(name = "role")
	public Role getU_role() {
		return u_role;
	}

	public void setU_role(Role u_role) {
		this.u_role = u_role;
	}

	@OneToOne(mappedBy = "usr", cascade = CascadeType.ALL, orphanRemoval = true)
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	public void addAddress(Address add)
	{
		this.addr=add;
		add.setUsr(this);
	}
	
	public void removeAddress(Address add)
	{
		this.addr=null;
		add.setUsr(null);
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", u_dob=" + u_dob + ", contact=" + contact + ", image=" + Arrays.toString(image)
				+ ", blood_group=" + blood_group + ", gender=" + gender + ", u_role=" + u_role + ", addr=" + addr + "]";
	}
	
	
}
