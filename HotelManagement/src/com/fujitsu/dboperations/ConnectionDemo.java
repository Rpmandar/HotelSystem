package com.fujitsu.dboperations;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import dbconfig.ConnectionFactory;



public class ConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Connection con=null;

		ConnectionFactory factory = ConnectionFactory.getConnectionFactory();
		try {
			con=factory.getConnection();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}

}
