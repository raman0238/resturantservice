package com.example.resturantservice.service;

import com.example.resturantservice.model.Resturant;
import com.example.resturantservice.repository.ResturantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantService {
    @Autowired
    ResturantRepository resturantRepository;
    public List<Resturant> getAllResturants() {
        return resturantRepository.findAll();
    }


    public void register(Resturant resturant) {
        resturantRepository.save(resturant);
    }
}
