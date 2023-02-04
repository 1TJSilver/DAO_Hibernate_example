package com.example.hw_8_2_1_1_dao_hibernate.repository;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, String> {
    List<Person> findAllByCity_of_living (String city_of_living);
    List<Person> findAllByAgeLessThan (int age);
    List<Optional<Person>> findAllByNameAndSurname (String name, String surname);
}
