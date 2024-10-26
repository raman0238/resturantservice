package com.example.resturantservice.repository;

import com.example.resturantservice.model.Resturant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResturantRepository extends JpaRepository<Resturant, Integer> {
}
