package com.example.baithithuchanhmd4.service;

import com.example.baithithuchanhmd4.model.City;
import com.example.baithithuchanhmd4.repository.IRepositoryCity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class CityServiceIplm implements IGeneralCity<City> {
    @Autowired
    private IRepositoryCity iRepositoryCity;

    @Override
    public Iterable<City>findAll() {
        return iRepositoryCity.findAll() ;
    }

    @Override
    public City findOne(Long id) {
        return iRepositoryCity.findById(id).orElseThrow();
    }

    @Override
    public void save(City city) {
iRepositoryCity.save(city);
    }

    @Override
    public void delete(Long id) {
iRepositoryCity.deleteById(id);
    }
}
