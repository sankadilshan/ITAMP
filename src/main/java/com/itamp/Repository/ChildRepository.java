package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itamp.Model.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {

	Child findByRegistrationId(String regiId);

	void deleteByChildId(String id);

}
