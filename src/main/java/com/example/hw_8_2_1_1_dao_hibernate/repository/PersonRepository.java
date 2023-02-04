package com.example.hw_8_2_1_1_dao_hibernate.repository;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, String> {
    @Query(value = "select p from Person p where p.city_of_living = :city")
    List<Person> findAllByCity_of_living (@Param("city") String city_of_living);
    @Query(value = "select p from Person p where p.age < :age")
    List<Person> findAllByAgeLessThan (@Param("age") int age);
    @Query(value = "select p from Person p where p.name = :name and p.surname = :surname")
    List<Optional<Person>> findAllByNameAndSurname (@Param("name") String name,
                                                    @Param("surname") String surname);
}
