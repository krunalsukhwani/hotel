package com.management.hotel.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@AllArgsConstructor
public class Room {

    @Id
    private int roomId;

    private String roomDesc;

    private Boolean status;

    private String types;

    private double roomPrice;
}
