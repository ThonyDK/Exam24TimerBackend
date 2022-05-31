package com.example.exam24timerbackend.configuration;

import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.entities.Cyclist;
import com.example.exam24timerbackend.repositories.BicycleTeamRepository;
import com.example.exam24timerbackend.repositories.CyclistRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("!test")
@Controller
public class MakeTestData implements ApplicationRunner {

    //Acceses to repo
    private CyclistRepository cyclistRepository;
    private BicycleTeamRepository bicycleTeamRepository;

    //Constructor
    public MakeTestData(CyclistRepository cyclistRepository, BicycleTeamRepository bicycleTeamRepository){
        this.cyclistRepository = cyclistRepository;
        this.bicycleTeamRepository = bicycleTeamRepository;

    }
    //Test data to database (Cyclist and Team)
    public void CyclistToDB(){
        //Teams
        BicycleTeam bicycleTeam1 = new BicycleTeam();
        bicycleTeam1.setTeamName("Quick-Step Alpha Vinyl Team");
        bicycleTeamRepository.save(bicycleTeam1);
        BicycleTeam bicycleTeam2 = new BicycleTeam();
        bicycleTeam2.setTeamName("Israel - Premier Tech");
        bicycleTeamRepository.save(bicycleTeam2);
        BicycleTeam bicycleTeam3 = new BicycleTeam();
        bicycleTeam3.setTeamName("Jumbo-Visma");
        bicycleTeamRepository.save(bicycleTeam3);
        BicycleTeam bicycleTeam4 = new BicycleTeam();
        bicycleTeam4.setTeamName("EF Education-EasyPost");
        bicycleTeamRepository.save(bicycleTeam4);

        //Cyclist
        Cyclist cyclist1 = new Cyclist();
        cyclist1.setName("Sepp Kuss ");
        cyclist1.setAge(24);
        cyclist1.setMontainPoints(12);
        cyclist1.setSprintPoints(12);
        cyclist1.setYouthPoints(15);
        cyclist1.setBestTimePoints(17.5);
        cyclist1.setBicycleTeam(bicycleTeam3);
        cyclistRepository.save(cyclist1);
        Cyclist cyclist2 = new Cyclist();
        cyclist2.setName("Tiesj Benoot");
        cyclist2.setAge(26);
        cyclist2.setMontainPoints(0);
        cyclist2.setSprintPoints(0);
        cyclist2.setBestTimePoints(15.5);
        cyclist2.setBicycleTeam(bicycleTeam3);
        cyclistRepository.save(cyclist2);
        Cyclist cyclist3 = new Cyclist();
        cyclist3.setName("Jonas Vingegaard");
        cyclist3.setAge(24);
        cyclist3.setMontainPoints(15);
        cyclist3.setSprintPoints(15);
        cyclist3.setYouthPoints(12);
        cyclist3.setBestTimePoints(10.0);
        cyclist3.setBicycleTeam(bicycleTeam3);
        cyclistRepository.save(cyclist3);
        Cyclist cyclist4 = new Cyclist();
        cyclist4.setName("Rohan Dennis ");
        cyclist4.setAge(28);
        cyclist4.setMontainPoints(5);
        cyclist4.setSprintPoints(6);
        cyclist4.setBestTimePoints(12.5);
        cyclist4.setBicycleTeam(bicycleTeam3);
        cyclistRepository.save(cyclist4);
        Cyclist cyclist5 = new Cyclist();
        cyclist5.setName("Wout Van Aert");
        cyclist5.setAge(27);
        cyclist5.setMontainPoints(10);
        cyclist5.setSprintPoints(5);
        cyclist5.setBestTimePoints(12.3);
        cyclist5.setBicycleTeam(bicycleTeam3);
        cyclistRepository.save(cyclist5);

        Cyclist cyclist6 = new Cyclist();
        cyclist6.setName("Michael Valgren");
        cyclist6.setAge(27);
        cyclist6.setMontainPoints(15);
        cyclist6.setSprintPoints(12);
        cyclist6.setBestTimePoints(11.0);
        cyclist6.setBicycleTeam(bicycleTeam4);
        cyclistRepository.save(cyclist6);
        Cyclist cyclist7 = new Cyclist();
        cyclist7.setName("Rigoberto Uran");
        cyclist7.setAge(30);
        cyclist7.setMontainPoints(0);
        cyclist7.setSprintPoints(5);
        cyclist7.setBestTimePoints(14.0);
        cyclist7.setBicycleTeam(bicycleTeam4);
        cyclistRepository.save(cyclist7);
        Cyclist cyclist8 = new Cyclist();
        cyclist8.setName("Magnus Cort");
        cyclist8.setAge(28);
        cyclist8.setMontainPoints(5);
        cyclist8.setSprintPoints(10);
        cyclist8.setBestTimePoints(12.5);
        cyclist8.setBicycleTeam(bicycleTeam4);
        cyclistRepository.save(cyclist8);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        //Execute to database
        CyclistToDB();

    }
}
