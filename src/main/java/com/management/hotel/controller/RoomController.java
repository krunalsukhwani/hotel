package com.management.hotel.controller;

import com.management.hotel.model.Room;
import com.management.hotel.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RequestMapping("room")
@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    @GetMapping("")
    public String getApplicationContext(){
        return "API is running";
    }

    @PostMapping("save")
    public Mono saveRoomDetails(@RequestBody Room room){
        return roomService.saveRoomDetails(room);
    }

    @GetMapping("all")
    public Flux<Room> getAllRoomDetails(){
        return roomService.getAllRoomDetails();
    }

    @GetMapping("single")
    public Mono<Room> getSingleRoomDetails(@RequestParam("id") int id){
        return roomService.getSingleRoomDetails(id);
    }

    @PutMapping("update")
    public Mono updateRoomDetails(@RequestBody Room room){
        return roomService.updateRoomDetails(room);
    }

    @DeleteMapping("delete/{id}")
    public Mono deleteRoomDetails(@PathVariable("id")int id){
        return roomService.deleteRoomDetails(id);
    }
}
