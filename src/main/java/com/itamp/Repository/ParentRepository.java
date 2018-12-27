package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.itamp.Model.Parent;

public interface ParentRepository extends JpaRepository<Parent, Long> {

	/*@Modifying
	@Query("insert into Parent (nic,motherMaidenName,registrationNo,fatherName,fatherNic,contactNo,multipleBirth,CRS,NNT,infoId) select :nic,:motherMaidenName,:registrationNo,:fatherName,:fatherNic,:contactNo,:multipleBirth,:CRS,:NNT,:infoId")
	void modifyingQueryInsertParent(@Param("nic")String nic, @Param("motherMaidenName")String motherMaidenName,@Param("registrationNo") String registrationNo,@Param("fatherName")String fatherName,
			@Param("fatherNic")String fatherNic, @Param("contactNo")String contactNo, @Param("multipleBirth")Boolean multipleBirth, @Param("CRS")Boolean CRS, @Param("NNT")Boolean NNT,@Param("infoId")Long infoId);
*/
}
