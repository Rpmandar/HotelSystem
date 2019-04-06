package com.fujitsu.hotel;

import java.sql.SQLException;
import java.util.List;

public interface HotelDAO {
	
	List<Hotel> getAllHotel() throws SQLException;
	Hotel getHotelById (int hotelId) throws SQLException;
	
	void insert (Hotel hotel) throws SQLException;
	void update (Hotel hotel) throws SQLException;
	void delete (Hotel hotel) throws SQLException;
	

}
