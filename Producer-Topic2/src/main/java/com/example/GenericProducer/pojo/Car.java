package com.example.GenericProducer.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {

    @JsonProperty("cId")
    private String carId;

    private String carName;

    private String fuelType;

    private Location location;

    private String timestamp;

}
