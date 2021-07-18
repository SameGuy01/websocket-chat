package com.kirill.websocketchat.service.impl;

import com.kirill.websocketchat.domain.Room;
import com.kirill.websocketchat.repository.RoomRepository;
import com.kirill.websocketchat.service.RoomService;
import com.kirill.websocketchat.exception.RoomNotFoundException;
import lombok.Data;

import java.util.List;

@Data
public class RoomServiceImpl implements RoomService {
    RoomRepository roomRepository;
    @Override
    public Room findById(Long id) {
        return roomRepository.findById(id).orElseThrow(RoomNotFoundException::new);
    }

    @Override
    public List<Room> getAllRooms() {
        return roomRepository.findAll();
    }

    @Override
    public void saveRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoomById(Long id) {
        roomRepository.deleteById(id);
    }
}
