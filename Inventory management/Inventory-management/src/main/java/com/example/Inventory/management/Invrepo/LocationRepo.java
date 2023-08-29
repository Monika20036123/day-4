package com.example.Inventory.management.Invrepo;


import com.example.Inventory.management.Entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface LocationRepo extends JpaRepository <Location,Integer>{
}
