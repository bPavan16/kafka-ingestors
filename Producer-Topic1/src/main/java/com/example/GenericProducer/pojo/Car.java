package com.example.GenericProducer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @JsonProperty("carId")
    private String carId;

    private String carName;

    private String fuelType;

    private int speed;
    private int fuel;

    private String timestamp;

}
