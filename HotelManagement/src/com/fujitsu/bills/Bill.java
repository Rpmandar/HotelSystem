package com.fujitsu.bills;

public class Bill implements Comparable<Bill> {
	
	private int billId;
	private float totalAmt;
	private String custId;
	private int hotelId;
	private String paymentId;
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
	public float getTotalAmt() {
		return totalAmt;
	}
	public void setTotalAmt(float totalAmt) {
		this.totalAmt = totalAmt;
	}
	public String getCustId() {
		return custId;
	}
	public void setCustId(String custId) {
		this.custId = custId;
	}
	public int getHotelId() {
		return hotelId;
	}
	public void setHotelId(int hotelId) {
		this.hotelId = hotelId;
	}
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public Bill(int billId, float totalAmt, String custId, int hotelId, String paymentId) {
		super();
		this.billId = billId;
		this.totalAmt = totalAmt;
		this.custId = custId;
		this.hotelId = hotelId;
		this.paymentId = paymentId;
	}
	@Override
	public String toString() {
		return "Bill [billId=" + billId + ", totalAmt=" + totalAmt + ", custId=" + custId + ", hotelId=" + hotelId
				+ ", paymentId=" + paymentId + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billId;
		result = prime * result + ((custId == null) ? 0 : custId.hashCode());
		result = prime * result + hotelId;
		result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
		result = prime * result + Float.floatToIntBits(totalAmt);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Bill))
			return false;
		Bill other = (Bill) obj;
		if (billId != other.billId)
			return false;
		if (custId == null) {
			if (other.custId != null)
				return false;
		} else if (!custId.equals(other.custId))
			return false;
		if (hotelId != other.hotelId)
			return false;
		if (paymentId == null) {
			if (other.paymentId != null)
				return false;
		} else if (!paymentId.equals(other.paymentId))
			return false;
		if (Float.floatToIntBits(totalAmt) != Float.floatToIntBits(other.totalAmt))
			return false;
		return true;
	}

	@Override
	public int compareTo(Bill o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
