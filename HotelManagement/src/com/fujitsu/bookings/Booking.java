package com.fujitsu.bookings;

public class Booking implements Comparable<Booking>{
	
	private int bookingId;
	private int date;
	private String hotelName;
	private int noOfRooms;
	private int noOfPeople;
	private String status;
	private int checkIn;
	private int checkOut;
	public int getBookingId() {
		return bookingId;
	}
	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public int getNoOfRooms() {
		return noOfRooms;
	}
	public void setNoOfRooms(int noOfRooms) {
		this.noOfRooms = noOfRooms;
	}
	public int getNoOfPeople() {
		return noOfPeople;
	}
	public void setNoOfPeople(int noOfPeople) {
		this.noOfPeople = noOfPeople;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getCheckIn() {
		return checkIn;
	}
	public void setCheckIn(int checkIn) {
		this.checkIn = checkIn;
	}
	public int getCheckOut() {
		return checkOut;
	}
	public void setCheckOut(int checkOut) {
		this.checkOut = checkOut;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookingId;
		result = prime * result + checkIn;
		result = prime * result + checkOut;
		result = prime * result + date;
		result = prime * result + ((hotelName == null) ? 0 : hotelName.hashCode());
		result = prime * result + noOfPeople;
		result = prime * result + noOfRooms;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Booking))
			return false;
		Booking other = (Booking) obj;
		if (bookingId != other.bookingId)
			return false;
		if (checkIn != other.checkIn)
			return false;
		if (checkOut != other.checkOut)
			return false;
		if (date != other.date)
			return false;
		if (hotelName == null) {
			if (other.hotelName != null)
				return false;
		} else if (!hotelName.equals(other.hotelName))
			return false;
		if (noOfPeople != other.noOfPeople)
			return false;
		if (noOfRooms != other.noOfRooms)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	public Booking(int bookingId, int date, String hotelName, int noOfRooms, int noOfPeople, String status, int checkIn,
			int checkOut) {
		super();
		this.bookingId = bookingId;
		this.date = date;
		this.hotelName = hotelName;
		this.noOfRooms = noOfRooms;
		this.noOfPeople = noOfPeople;
		this.status = status;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	@Override
	public String toString() {
		return "Booking [bookingId=" + bookingId + ", date=" + date + ", hotelName=" + hotelName + ", noOfRooms="
				+ noOfRooms + ", noOfPeople=" + noOfPeople + ", status=" + status + ", checkIn=" + checkIn
				+ ", checkOut=" + checkOut + "]";
	}

	@Override
	public int compareTo(Booking o) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
