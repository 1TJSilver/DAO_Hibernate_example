package com.example.hw_8_2_1_1_dao_hibernate.service;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import com.example.hw_8_2_1_1_dao_hibernate.repository.HibRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class HibService {
    public HibRepository repository;

    public List<Person> getPersonsCity(String city){
        return repository.getPersonsCity(city);
    }
}
