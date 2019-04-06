package com.fujitsu.hotel;

public class Hotel implements Comparable<Hotel> {
	
	
	private int hotelId;
	private String hotelName;
	private String website;
	private int rating;
	private String review;
	private int phoneNo;
	private String hotel_Email_Id;
	private String address;
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getHotel_Email_Id() {
		return hotel_Email_Id;
	}
	public void setHotel_Email_Id(String hotel_Email_Id) {
		this.hotel_Email_Id = hotel_Email_Id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Hotel(int hotelId, String hotelName, String website, int rating, String review, int phoneNo,
			String hotel_Email_Id, String address) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.website = website;
		this.rating = rating;
		this.review = review;
		this.phoneNo = phoneNo;
		this.hotel_Email_Id = hotel_Email_Id;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", website=" + website + ", rating=" + rating
				+ ", review=" + review + ", phoneNo=" + phoneNo + ", hotel_Email_Id=" + hotel_Email_Id + ", address="
				+ address + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + hotelId;
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + ((hotel_Email_Id == null) ? 0 : hotel_Email_Id.hashCode());
		result = prime * result + phoneNo;
		result = prime * result + rating;
		result = prime * result + ((review == null) ? 0 : review.hashCode());
		result = prime * result + ((website == null) ? 0 : website.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Hotel))
			return false;
		Hotel other = (Hotel) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (hotel_Email_Id == null) {
			if (other.hotel_Email_Id != null)
				return false;
		} else if (!hotel_Email_Id.equals(other.hotel_Email_Id))
			return false;
		if (phoneNo != other.phoneNo)
			return false;
		if (rating != other.rating)
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		if (website == null) {
			if (other.website != null)
				return false;
		} else if (!website.equals(other.website))
			return false;
		return true;
	}
	@Override
	public int compareTo(Hotel o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
