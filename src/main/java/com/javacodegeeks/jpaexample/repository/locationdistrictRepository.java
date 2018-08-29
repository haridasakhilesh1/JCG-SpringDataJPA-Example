package com.javacodegeeks.jpaexample.repository;

import com.javacodegeeks.jpaexample.model.Locationdistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface locationdistrictRepository extends JpaRepository<Locationdistrict, Integer> {
}


