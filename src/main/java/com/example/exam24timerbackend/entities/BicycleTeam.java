package com.example.exam24timerbackend.entities;

import com.example.exam24timerbackend.dto.CyclistRequest;
//import com.example.exam24timerbackend.dto.TeamRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Data
@Table(name = "bicycleTeams")
public class BicycleTeam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String teamName;

    //
    /*
    @OneToMany(mappedBy = "bicycleTeam", cascade = CascadeType.PERSIST)
    private Set<Cyclist> cyclists = new HashSet<>();*


    public BicycleTeam(TeamRequest bodyOfRequest) {
        this.teamName = bodyOfRequest.getTeamName();
        this.teamMembers = bodyOfRequest.getTeamMembers();
    }*/
}
