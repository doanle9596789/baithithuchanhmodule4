package com.example.baithithuchanhmd4.repository;

import com.example.baithithuchanhmd4.model.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRepositoryCity extends JpaRepository<City,Long> {
}
