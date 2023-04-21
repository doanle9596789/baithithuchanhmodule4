package com.example.baithithuchanhmd4.service;

import com.example.baithithuchanhmd4.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface IGeneralCity <E>{
    Iterable<E> findAll();
    E findOne(Long id);
    void save(E e);
    void delete(Long id);
}
