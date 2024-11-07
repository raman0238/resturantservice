package com.example.resturantservice.controller;

import com.example.resturantservice.model.Resturant;
import com.example.resturantservice.service.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resturant")
public class ResturantController {

    @Autowired
    ResturantService resturantService;

    @GetMapping("/resturants")
    public List<Resturant> getAllResturants() {
       return resturantService.getAllResturants();
    }

    @PostMapping("/register")
    public void register(@RequestBody Resturant resturant) {
        resturantService.register(resturant);
    }
}
