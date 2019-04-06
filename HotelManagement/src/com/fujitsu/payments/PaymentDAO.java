package com.fujitsu.payments;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface PaymentDAO {
	

	List<Payment> getAllPayment() throws SQLException;
	Hotel getPaymentById (int paymentId) throws SQLException;
	
	void insert (Payment payment) throws SQLException;
	void update (Payment payment) throws SQLException;
	void delete (Payment payment) throws SQLException;
	

}
