package com.fujitsu.bills;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface BillDAO {
	
	

	List<Bill> getAllBill() throws SQLException;
	Hotel getBillById (int billId) throws SQLException;
	
	void insert (Bill bill) throws SQLException;
	void update (Bill bill) throws SQLException;
	void delete (Bill bill) throws SQLException;
	

}
