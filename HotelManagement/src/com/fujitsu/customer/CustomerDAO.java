package com.fujitsu.customer;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface CustomerDAO {
	
	

	List<Customer> getAllCustomer() throws SQLException;
	Hotel getCustomerById (int customerId) throws SQLException;
	
	void insert (Customer customer) throws SQLException;
	void update (Customer customer) throws SQLException;
	void delete (Customer customer) throws SQLException;
	

}
