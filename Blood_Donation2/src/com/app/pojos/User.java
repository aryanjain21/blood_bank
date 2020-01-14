package com.app.pojos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User 
{
	private Integer u_id;
	private String fName, lName, email, password;
	private Date u_dob;
	private String contact;
	private Integer weight;
	private byte[] image;
	private String blood_group;
	private String gender;
	private Role u_role;
	private Address addr;//user has a address
	//one to many
	private List<BloodRequest> requests = new ArrayList<>(); 
	private List<Camp> camps = new ArrayList<>();

	public User() {
		// TODO Auto-generated constructor stub
	}

	

	public User(String fName, String lName, String email, String password, Date u_dob, String contact, Integer weight,
			byte[] image, String blood_group, String gender, Role u_role, Address addr) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.password = password;
		this.u_dob = u_dob;
		this.contact = contact;
		this.weight = weight;
		this.image = image;
		this.blood_group = blood_group;
		this.gender = gender;
		this.u_role = u_role;
		this.addr = addr;
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

	public Integer getWeight() {
		return weight;
	}

	public void setWeight(Integer weight) {
		this.weight = weight;
	}

	@OneToMany(mappedBy = "requster_id", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<BloodRequest> getRequests() {
		return requests;
	}

	public void setRequests(List<BloodRequest> requests) {
		this.requests = requests;
	}

	@OneToMany(mappedBy = "organizer_id", cascade = CascadeType.ALL, orphanRemoval = true)
	public List<Camp> getCamps() {
		return camps;
	}

	public void setCamps(List<Camp> camps) {
		this.camps = camps;
	}



	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", fName=" + fName + ", lName=" + lName + ", email=" + email + ", password="
				+ password + ", u_dob=" + u_dob + ", contact=" + contact + ", weight=" + weight + ", image="
				+ Arrays.toString(image) + ", blood_group=" + blood_group + ", gender=" + gender + ", u_role=" + u_role
				+ ", addr=" + addr + "]";
	}



	
	
	
}
