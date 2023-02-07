package com.example.hw_8_2_1_1_dao_hibernate.service;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import com.example.hw_8_2_1_1_dao_hibernate.repository.HibRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HibService {
    public HibRepository repository;

    public HibService(HibRepository repository){
        this.repository = repository;
    }

    public List<Person> findAllByCity_of_living(String city){
        return repository.findAllByCity_of_living(city);
    }
    public List<Person> findAllByAgeLessThan (int age){
        return repository.findAllByAgeLessThan(age);
    }
    public List<Optional<Person>> findAllByNameAndSurname (String name, String surname){
        return repository.findAllByNameAndSurname(name, surname);
    }
}
