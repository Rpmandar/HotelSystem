package com.fujitsu.customer;

public class Customer implements Comparable<Customer> {
	private String Address;
	private int custId;
	private String custName;
	private int phoneNo;
	private String email_Id;
	private String gender;
	private int dob;
	private String nationality;
	private String id_Proof;
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getEmail_Id() {
		return email_Id;
	}
	public void setEmail_Id(String email_Id) {
		this.email_Id = email_Id;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getDob() {
		return dob;
	}
	public void setDob(int dob) {
		this.dob = dob;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getId_Proof() {
		return id_Proof;
	}
	public void setId_Proof(String id_Proof) {
		this.id_Proof = id_Proof;
	}
	/*public Customer(String address, int custId, String custName, int phoneNo, String email_Id, String gender, int dob,
			String nationality, String id_Proof) {
		super();
		Address = address;
		this.custId = custId;
		this.custName = custName;
		this.phoneNo = phoneNo;
		this.email_Id = email_Id;
		this.gender = gender;
		this.dob = dob;
		this.nationality = nationality;
		this.id_Proof = id_Proof;
	}*/
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Address == null) ? 0 : Address.hashCode());
		result = prime * result + custId;
		result = prime * result + ((custName == null) ? 0 : custName.hashCode());
		result = prime * result + dob;
		result = prime * result + ((email_Id == null) ? 0 : email_Id.hashCode());
		result = prime * result + ((gender == null) ? 0 : gender.hashCode());
		result = prime * result + ((id_Proof == null) ? 0 : id_Proof.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + phoneNo;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Customer))
			return false;
		Customer other = (Customer) obj;
		if (Address == null) {
			if (other.Address != null)
				return false;
		} else if (!Address.equals(other.Address))
			return false;
		if (custId != other.custId)
			return false;
		if (custName == null) {
			if (other.custName != null)
				return false;
		} else if (!custName.equals(other.custName))
			return false;
		if (dob != other.dob)
			return false;
		if (email_Id == null) {
			if (other.email_Id != null)
				return false;
		} else if (!email_Id.equals(other.email_Id))
			return false;
		if (gender == null) {
			if (other.gender != null)
				return false;
		} else if (!gender.equals(other.gender))
			return false;
		if (id_Proof == null) {
			if (other.id_Proof != null)
				return false;
		} else if (!id_Proof.equals(other.id_Proof))
			return false;
		if (nationality == null) {
			if (other.nationality != null)
				return false;
		} else if (!nationality.equals(other.nationality))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		return true;
	}
	public Customer() {
		super();
	}
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
