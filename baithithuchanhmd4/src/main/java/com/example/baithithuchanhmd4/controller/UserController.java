package com.example.baithithuchanhmd4.controller;

import com.example.baithithuchanhmd4.model.City;
import com.example.baithithuchanhmd4.service.CityServiceIplm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/city")
public class UserController {
    @Autowired
    private CityServiceIplm cityServiceIplm;
    @GetMapping("/findAll")
    public ResponseEntity<Iterable<City>>listCity(){
        return new ResponseEntity<>(cityServiceIplm.findAll(), HttpStatus.OK);

    }
    @PostMapping("/createCity")
    public ResponseEntity<City>createCity(@RequestBody City city){
        cityServiceIplm.save(city);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @PutMapping("/updateCity/{id}")
    public ResponseEntity<Void>updateCity(@PathVariable Long id){
        City city=cityServiceIplm.findOne(id);
        cityServiceIplm.save(city);
        return new ResponseEntity<>(HttpStatus.OK);

    }
    @DeleteMapping("/deleteCity/{id}")
    public ResponseEntity<Void>deleteCity(@PathVariable Long id){
        cityServiceIplm.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @GetMapping("/finById")
    public ResponseEntity<City>finById(@PathVariable Long id){
        City city=cityServiceIplm.findOne(id);
        return new ResponseEntity<>(city,HttpStatus.OK);
    }
}
