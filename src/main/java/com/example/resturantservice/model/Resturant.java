package com.example.resturantservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "resturant")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Resturant {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    int resturantID;
    String name;
    String address;
}
