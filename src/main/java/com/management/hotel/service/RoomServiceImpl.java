package com.management.hotel.service;

import com.management.hotel.model.Room;
import com.management.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class RoomServiceImpl implements RoomService{

    @Autowired
    RoomRepository roomRepository;

    @Override
    public Mono saveRoomDetails(Room room) {
        return roomRepository.save(room);
    }

    @Override
    public Flux<Room> getAllRoomDetails() {
        return roomRepository.findAll();
    }
}
