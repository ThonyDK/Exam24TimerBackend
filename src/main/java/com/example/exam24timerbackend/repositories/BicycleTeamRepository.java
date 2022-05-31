package com.example.exam24timerbackend.repositories;

import com.example.exam24timerbackend.entities.BicycleTeam;
import com.example.exam24timerbackend.entities.Cyclist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Collection;
import java.util.List;

public interface BicycleTeamRepository extends JpaRepository<BicycleTeam, Long> {

}
