package com.example.exam24timerbackend.api;

import com.example.exam24timerbackend.dto.CyclistRequest;
import com.example.exam24timerbackend.dto.CyclistResponse;
import com.example.exam24timerbackend.services.CyclistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@CrossOrigin("*") //Giving us full cors access
@RequestMapping("api/cyclist")
public class CyclistController {

    @Autowired //To make a constructor under the surface
    CyclistService cyclistService;

    //GetMapping to get a list of cyclist
    @GetMapping()
    public List<CyclistResponse> getAllCyclist() {
        return cyclistService.getAllCyclist();
    }

    @GetMapping("/points")
    public List<CyclistResponse> getAllCyclistPoints() {
        return cyclistService.getAllCyclistPoints();
    }

    //PostMapping to add a cyclist
    @PostMapping("/addCyclist")
    public String addCyclist(@RequestBody CyclistRequest cyclist){
        System.out.println(cyclist);
        return cyclistService.addCyclist(cyclist);
    }

    //PutMapping to editing a cyclist or a cyclist team
    @PutMapping("/{id}")
    public CyclistResponse editCyclist(@RequestBody CyclistRequest cyclistRequest, @PathVariable int id){
        return cyclistService.editCyclist(cyclistRequest,id);
    }

    //DeleteMapping to delete a cyclist from the list
    @DeleteMapping("/{id}")
    public String deleteCyclist(@PathVariable int id) {
        cyclistService.deleteCyclist(id);
        return "Cyclist has been deleted";
    }
}
