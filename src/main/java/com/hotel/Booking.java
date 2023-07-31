package com.hotel;

import java.sql.SQLException;
import java.util.List;

public class Booking{

    private Dao dao;

    public Booking(Dao dao) {
        this.dao = dao;
    }

    public boolean checkRoomAvailability(String roomName) throws SQLException {

        List<String> roomsAvailable = dao.fetchAvailableRooms();
        return roomsAvailable.contains(roomName);
    }

}