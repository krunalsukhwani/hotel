package com.management.hotel.repository;

import com.management.hotel.model.Room;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends ReactiveMongoRepository<Room, Integer> {
}
