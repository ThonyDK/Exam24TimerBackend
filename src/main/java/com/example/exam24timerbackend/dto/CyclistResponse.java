package com.example.exam24timerbackend.dto;

import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.entities.Cyclist;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class CyclistResponse {

    private int cyclistId;
    private String name;
    private BicycleTeam bicycleTeam; //Skal muligvis ændres
    private int age;
    private int mountainPoints;
    private int sprintPoints;
    private int youthPoints;
    private double bestTimePoints;

    //Constructor
    public CyclistResponse(Cyclist cyclist) {
        this.name = cyclist.getName();
        this.bicycleTeam = cyclist.getBicycleTeam();
        this.cyclistId = cyclist.getId();
    }
    //Empty constructor
    public CyclistResponse(){

    }
}
