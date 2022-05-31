package com.example.exam24timerbackend.entities;


import com.example.exam24timerbackend.dto.CyclistRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "cyclist")
public class Cyclist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String name;
    @Column
    private int age;
    @Column
    private int montainPoints;
    @Column
    private int sprintPoints;
    @Column
    private int youthPoints;
    @Column
    private double bestTimePoints;

    @ManyToOne(fetch = FetchType.EAGER,optional = false)
    @JoinColumn(name = "bicycleTeam_id")
    private BicycleTeam bicycleTeam;

    public Cyclist(CyclistRequest bodyOfRequest) {
        this.name = bodyOfRequest.getName();
        this.bicycleTeam = bodyOfRequest.getBicycleTeam();
        this.age = bodyOfRequest.getAge();
        this.montainPoints = bodyOfRequest.getMountainPoints();
        this.sprintPoints = bodyOfRequest.getSprintPoints();
        this.youthPoints = bodyOfRequest.getYouthPoints();
        this.bestTimePoints = bodyOfRequest.getBestTimePoints();
    }
}
