package com.itamp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itamp.Model.DS;


@Repository
public interface DSRepository extends JpaRepository<DS, Integer> {

	DS findByDsId(int dsId);

    DS findByName(String name);


//	List<DS> findByDS_RdhsId(int rdhsId); 

}
