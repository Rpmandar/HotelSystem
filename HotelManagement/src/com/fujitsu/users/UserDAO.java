package com.fujitsu.users;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface UserDAO {
	

	List<User> getAllUser() throws SQLException;
	Hotel getUserById (int userId) throws SQLException;
	
	void insert (User user) throws SQLException;
	void update (User user) throws SQLException;
	void delete (User user) throws SQLException;
	

}
