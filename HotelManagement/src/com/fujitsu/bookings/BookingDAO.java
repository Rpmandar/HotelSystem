package com.fujitsu.bookings;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface BookingDAO {
	

	List<Booking> getAllBookings() throws SQLException;
	Hotel getBookingById (int bookingId) throws SQLException;
	
	void insert (Booking booking) throws SQLException;
	void update (Booking booking) throws SQLException;
	void delete (Booking booking) throws SQLException;
	

}
