package com.example.resturantservice.controller;

import com.example.resturantservice.model.Resturant;
import com.example.resturantservice.service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ResturantController {

    @Autowired
    ResturantService resturantService;

    @GetMapping("/resturants")
    public List<Resturant> getAllResturants() {
       return resturantService.getAllResturants();
    }

    @PostMapping("/resturant")
    public void register(@RequestBody Resturant resturant) {
        resturantService.register(resturant);
    }
}
