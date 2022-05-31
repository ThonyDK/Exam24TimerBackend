package com.example.exam24timerbackend.repositories;

import com.example.exam24timerbackend.entities.Cyclist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CyclistRepository extends JpaRepository<Cyclist, Integer> {

}
