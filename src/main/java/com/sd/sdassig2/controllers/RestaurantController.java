package com.sd.sdassig2.controllers;

import com.sd.sdassig2.repository.RestaurantRepository;
import com.sd.sdassig2.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
//@ComponentScan("com.sd.sdassig2.repository")
public class RestaurantController {

//    @Autowired
//    private RestaurantRepository repository;
//    RestaurantController (RestaurantRepository repository){
//        this.repository = repository;
//    }




    @GetMapping("/restaurants")
    public ResponseEntity<List<Restaurant>> restauranst(){
        List<Restaurant> restaurants = new ArrayList<>();
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Responded", "RestaurantController");
        return ResponseEntity.accepted().headers(httpHeaders).body(restaurants);
    }

    @GetMapping("/restaurantstest")
    public ResponseEntity<List<Restaurant>> restauranstTest(){
        List<Restaurant> restaurants = new ArrayList<>();



        restaurants.add(new Restaurant("abcd", "Somewhere", "A Reastaurant"));
        restaurants.add(new Restaurant("b", "Somewhere", "A Reastaurant"));
        restaurants.add(new Restaurant("c", "Somewhere", "A Reastaurant"));
        restaurants.add(new Restaurant("d", "Somewhere", "A Reastaurant"));
        restaurants.add(new Restaurant("e", "Somewhere", "A Reastaurant"));

//        repository.save(new Restaurant("b", "Somewhere", "A Reastaurant"));
//        repository.save(new Restaurant("c", "Somewhere", "A Reastaurant"));
//        repository.save(new Restaurant("d", "Somewhere", "A Reastaurant"));
//        repository.save(new Restaurant("e", "Somewhere", "A Reastaurant"));

        //restaurants = repository.findAll().;

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Responded", "RestaurantController");
        return ResponseEntity.accepted().headers(httpHeaders).body(restaurants);
    }
}
