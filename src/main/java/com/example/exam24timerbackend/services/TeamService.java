package com.example.exam24timerbackend.services;

import com.example.exam24timerbackend.dto.CyclistResponse;
//import com.example.exam24timerbackend.dto.TeamResponse;
import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.entities.Cyclist;
import com.example.exam24timerbackend.repositories.BicycleTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TeamService {

    @Autowired
    BicycleTeamRepository bicycleTeamRepository;



    public BicycleTeam getTeam(Long id){
        Optional team = bicycleTeamRepository.findById(id);
        if (team.isPresent()){
            BicycleTeam bicycleTeam = bicycleTeamRepository.findById(id).get();
            return bicycleTeam;
        }else {
            return null;
        }
    }
}
