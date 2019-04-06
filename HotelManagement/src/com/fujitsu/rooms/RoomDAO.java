package com.fujitsu.rooms;

import java.sql.SQLException;
import java.util.List;

import com.fujitsu.hotel.Hotel;

public interface RoomDAO {
	
	

	List<Room> getAllRoom() throws SQLException;
	Hotel getRoomById (int roomId) throws SQLException;
	
	void insert (Room room) throws SQLException;
	void update (Room room) throws SQLException;
	void delete (Room room) throws SQLException;
	

}
