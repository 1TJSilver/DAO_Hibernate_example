package com.example.hw_8_2_1_1_dao_hibernate.repository;

import com.example.hw_8_2_1_1_dao_hibernate.base.Person;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.List;

public class HibRepository {
    @PersistenceContext
    EntityManager entityManager;

    @Transactional
    public List<Person> getPersonsCity(String city){
        List<Person> result = entityManager.createQuery("select p from Person p where p.city_of_living = :city")
                .setParameter("city", city).getResultList();
        return result;
    }
}
