package com.example.exam24timerbackend.api;

//import com.example.exam24timerbackend.dto.TeamResponse;
import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.repositories.BicycleTeamRepository;
import com.example.exam24timerbackend.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("api/bicycleTeams")
public class TeamController {

    @Autowired
    TeamService teamService;


    @GetMapping("/{id}")
    public BicycleTeam getTeam(@PathVariable Long id){
        return teamService.getTeam(id);
    }
}
