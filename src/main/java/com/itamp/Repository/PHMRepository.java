package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.itamp.Model.PHM;

public interface PHMRepository extends JpaRepository<PHM, Integer> {

    PHM findByName(String name);

}
