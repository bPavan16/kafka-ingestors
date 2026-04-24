package com.example.GenericProducer.util;

import com.example.GenericProducer.pojo.Car;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Random;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class RandomCarDataGenerator {

    @Value("${CAR_ID}")
    private  String carIDString;

    @Value("${CAR_NUMBER}")
    private  String carNumberString;

    private static final Random random = new Random();
    
    private static final String[] FUEL_TYPES = {"Electric", "Petrol", "Diesel", "Hybrid", "LPG"};
    
    private static final String[] CAR_NAMES = {
        "Tesla Model 3", "Tesla Model S", "BMW 3 Series", "Audi A4", 
        "Mercedes C-Class", "Honda Civic", "Toyota Camry"
    };

    public Car generateRandomCar() {
        Car car = new Car();
        ArrayList<String> carIdList = new ArrayList<>();
        carIdList.add("CAR-001");
//        carIdList.add("CAR-002");
//        carIdList.add("CAR-003");
//        carIdList.add("CAR-004");
//        carIdList.add("CAR-005");
//        carIdList.add("BIKE-001");
//        carIdList.add("BIKE-002");
//        carIdList.add("BIKE-003");
//        carIdList.add("BIKE-004");
//        carIdList.add("BIKE-005");

        String carId = carIdList.get(random.nextInt(carIdList.size()));
        String carName = CAR_NAMES[random.nextInt(CAR_NAMES.length)];
        String fuelType = FUEL_TYPES[random.nextInt(FUEL_TYPES.length)];
        
        car.setCarId(carId);
        car.setCarName(carName);
        car.setFuelType(fuelType);
        car.setSpeed(random.nextInt(100)); // Speed: 0-99 km/h
        car.setFuel(random.nextInt(101));  // Fuel: 0-100%
        car.setTimestamp(Instant.now().toString());
        
        return car;
    }
}
