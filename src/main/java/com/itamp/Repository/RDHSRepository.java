package com.itamp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.itamp.Model.RDHS;

public interface RDHSRepository extends JpaRepository<RDHS, Integer> {

	RDHS findByName(String name);
	RDHS findByRdhsId(int rdhsId);

		

}
