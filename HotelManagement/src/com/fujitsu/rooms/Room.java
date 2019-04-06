package com.fujitsu.rooms;

public class Room implements Comparable<Room> {
	
	private String roomId;
	private String roomType;
	private String availableRoom;
	public String getRoomId() {
		return roomId;
	}
	public void setRoomId(String roomId) {
		this.roomId = roomId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getAvailableRoom() {
		return availableRoom;
	}
	public void setAvailableRoom(String availableRoom) {
		this.availableRoom = availableRoom;
	}
	public Room(String roomId, String roomType, String availableRoom) {
		super();
		this.roomId = roomId;
		this.roomType = roomType;
		this.availableRoom = availableRoom;
	}
	@Override
	public String toString() {
		return "Romm [roomId=" + roomId + ", roomType=" + roomType + ", availableRoom=" + availableRoom + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((availableRoom == null) ? 0 : availableRoom.hashCode());
		result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
		result = prime * result + ((roomType == null) ? 0 : roomType.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Room))
			return false;
		Room other = (Room) obj;
		if (availableRoom == null) {
			if (other.availableRoom != null)
				return false;
		} else if (!availableRoom.equals(other.availableRoom))
			return false;
		if (roomId == null) {
			if (other.roomId != null)
				return false;
		} else if (!roomId.equals(other.roomId))
			return false;
		if (roomType == null) {
			if (other.roomType != null)
				return false;
		} else if (!roomType.equals(other.roomType))
			return false;
		return true;
	}
	@Override
	public int compareTo(Room o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
