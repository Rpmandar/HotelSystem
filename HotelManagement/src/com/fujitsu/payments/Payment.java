package com.fujitsu.payments;

public class Payment implements Comparable<Payment> {
	
	private String paymentId;
	private String paymentMode;
	private String offer;
	private float cancellationCharges;
	public String getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	public String getOffer() {
		return offer;
	}
	public void setOffer(String offer) {
		this.offer = offer;
	}
	public float getCancellationCharges() {
		return cancellationCharges;
	}
	public void setCancellationCharges(float cancellationCharges) {
		this.cancellationCharges = cancellationCharges;
	}
	public Payment(String paymentId, String paymentMode, String offer, float cancellationCharges) {
		super();
		this.paymentId = paymentId;
		this.paymentMode = paymentMode;
		this.offer = offer;
		this.cancellationCharges = cancellationCharges;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", paymentMode=" + paymentMode + ", offer=" + offer
				+ ", cancellationCharges=" + cancellationCharges + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Float.floatToIntBits(cancellationCharges);
		result = prime * result + ((offer == null) ? 0 : offer.hashCode());
		result = prime * result + ((paymentId == null) ? 0 : paymentId.hashCode());
		result = prime * result + ((paymentMode == null) ? 0 : paymentMode.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Payment))
			return false;
		Payment other = (Payment) obj;
		if (Float.floatToIntBits(cancellationCharges) != Float.floatToIntBits(other.cancellationCharges))
			return false;
		if (offer == null) {
			if (other.offer != null)
				return false;
		} else if (!offer.equals(other.offer))
			return false;
		if (paymentId == null) {
			if (other.paymentId != null)
				return false;
		} else if (!paymentId.equals(other.paymentId))
			return false;
		if (paymentMode == null) {
			if (other.paymentMode != null)
				return false;
		} else if (!paymentMode.equals(other.paymentMode))
			return false;
		return true;
	}
	@Override
	public int compareTo(Payment o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
