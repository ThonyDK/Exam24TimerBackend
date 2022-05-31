package com.example.exam24timerbackend.dto;

import com.example.exam24timerbackend.entities.BicycleTeam;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CyclistRequest {
//CyclistRequest er når vi sender data til databasen fx en tilføjelse af en cyclist med nedenstående attributter.
//Nede i servicelaget har vi fx en klasse som hedder addCyclist() som har parameter CyclistRequest.
//Controlleren tager imod request fra clienten om at der skal tilføjes en cyclist.

    private int cyclistId;
    private String name;
    private BicycleTeam bicycleTeam;
    private int age;
    private int mountainPoints;
    private int sprintPoints;
    private int youthPoints;
    private double bestTimePoints;
}
