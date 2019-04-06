package com.fujitsu.customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public class CustomerDAOImpl implements CustomerDAO {
Connection con;
	
		
		@Override
		public List<Customer> getAllCustomer() throws SQLException {
			// TODO Auto-generated method stub



			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from customer");
			ArrayList<Customer> custList = new ArrayList<>();

			while(rs.next()) {


				int custId=rs.getInt(1);
				String custName = rs.getString(2);
				int phoneNo=rs.getInt(3);
				String email_Id=rs.getString(4);
				String address = rs.getString(5);
				String gender=rs.getString(6);
				int dob=rs.getInt(7);
				String nationality=rs.getString(8);
				String id_Proof=rs.getString(9);
				String Address=rs.getString(10);

				Customer cust = new Customer();
				cust.setCustId(custId);
				cust.setCustName(custName);
				cust.setPhoneNo(phoneNo);
				cust.setEmail_Id(email_Id);
				cust.setGender(gender);
				cust.setDob(dob);
				cust.setNationality(nationality);
				cust.setId_Proof(id_Proof);
				cust.setAddress(Address);
				
				
				custList.add(cust);


			}

			return custList;
		}
		
		

	

	@Override
	public Hotel getCustomerById(int customerId) throws SQLException {
		// TODO Auto-generated method stub
		
		
		
		return null;
	}

	@Override
	public void insert(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="insert into Customer values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement pstmt= con.prepareStatement(sql);
		pstmt.setInt(1, customer.getCustId());
		pstmt.setString(2, customer.getAddress());
		pstmt.setString(3, customer.getCustName());
		pstmt.setString(4, customer.getEmail_Id());
		pstmt.setString(5, customer.getGender());
		pstmt.setString(6, customer.getNationality());
		pstmt.setString(7, customer.getId_Proof());
		pstmt.setInt(8,customer.getDob());
		pstmt.setInt(9, customer.getPhoneNo());
		
		int updateCount = pstmt.executeUpdate();
		if(updateCount >0)
		System.out.println("customer is added");
		else
			System.out.println("customer should not be added.sorry!");
	}

	@Override
	public void update(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		String sql="update customer set custId=?,Address=?,"
	}

	@Override
	public void delete(Customer customer) throws SQLException {
		// TODO Auto-generated method stub
		
	}


}
