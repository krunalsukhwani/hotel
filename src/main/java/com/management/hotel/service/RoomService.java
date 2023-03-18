package com.management.hotel.service;

import com.management.hotel.model.Room;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface RoomService {

    Mono saveRoomDetails(Room room);

    Flux<Room> getAllRoomDetails();
}
