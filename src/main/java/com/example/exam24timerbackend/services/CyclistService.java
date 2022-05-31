package com.example.exam24timerbackend.services;


import com.example.exam24timerbackend.dto.CyclistRequest;
import com.example.exam24timerbackend.dto.CyclistResponse;
import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.entities.Cyclist;
import com.example.exam24timerbackend.errors.Client4xxException;
import com.example.exam24timerbackend.repositories.BicycleTeamRepository;
import com.example.exam24timerbackend.repositories.CyclistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CyclistService {

    @Autowired //Creating constructor under the surface
    CyclistRepository cyclistRepository;


    //Get a list of cyclist
    public List<CyclistResponse> getAllCyclist() {
        return cyclistRepository.findAll()
                .stream()
                .map(this::convertEntityToDto)
                .collect(Collectors.toList());
    }
    //Converting Entity to DTO (cyclistResponse)
    private CyclistResponse convertEntityToDto(Cyclist cyclist) {
        CyclistResponse cyclistWithBicycleTeamDto = new CyclistResponse();
        cyclistWithBicycleTeamDto.setCyclistId(cyclist.getId());
        cyclistWithBicycleTeamDto.setName(cyclist.getName());
        cyclistWithBicycleTeamDto.setBicycleTeam(cyclist.getBicycleTeam());
        return cyclistWithBicycleTeamDto;
    }

    //Get a list of cyclist with points
    public List<CyclistResponse> getAllCyclistPoints() {
        return cyclistRepository.findAll()
                .stream()
                .map(this::convertEntityToDto2)
                .collect(Collectors.toList());
    }

    //Converting Entity to DTO (cyclistResponse)
    private CyclistResponse convertEntityToDto2(Cyclist cyclist) {
        CyclistResponse cyclistWithBicycleTeamDto2 = new CyclistResponse();
        cyclistWithBicycleTeamDto2.setCyclistId(cyclist.getId());
        cyclistWithBicycleTeamDto2.setName(cyclist.getName());
        cyclistWithBicycleTeamDto2.setBicycleTeam(cyclist.getBicycleTeam());
        cyclistWithBicycleTeamDto2.setAge(cyclist.getAge());
        cyclistWithBicycleTeamDto2.setMountainPoints(cyclist.getMontainPoints());
        cyclistWithBicycleTeamDto2.setSprintPoints(cyclist.getSprintPoints());
        cyclistWithBicycleTeamDto2.setYouthPoints(cyclist.getYouthPoints());
        cyclistWithBicycleTeamDto2.setBestTimePoints(cyclist.getBestTimePoints());
        return cyclistWithBicycleTeamDto2;
    }

    //Adding cyclist to list
    public String addCyclist(CyclistRequest bodyOfRequest){
        System.out.println(bodyOfRequest);
        Cyclist cyclistEntity = new Cyclist(bodyOfRequest);
        cyclistRepository.save(cyclistEntity);
        return "Cyclist added succesfully";
    }

    //fx. Edit something
    public CyclistResponse editCyclist(CyclistRequest cyclistToEdit, int cyclistId){
        Cyclist cyclist = cyclistRepository.findById(cyclistId).orElseThrow(()-> new Client4xxException("Cyclist not found"));
        cyclist.setName(cyclistToEdit.getName());
        cyclist.setBicycleTeam(cyclistToEdit.getBicycleTeam()); //slet for at få det til at virke
        cyclistRepository.save(cyclist);
        return new CyclistResponse(cyclistRepository.save(cyclist));
    }

    //Delete cyclist from list
    public void deleteCyclist(int id) {
        cyclistRepository.deleteById(id);
    }
}
