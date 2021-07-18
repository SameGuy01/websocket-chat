package com.kirill.websocketchat.service;

import com.kirill.websocketchat.domain.Message;
import com.kirill.websocketchat.domain.Room;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    Room findById(Long id);
    List<Room> getAllRooms();
    void saveRoom(Room room);
    void deleteRoomById(Long id);
}
