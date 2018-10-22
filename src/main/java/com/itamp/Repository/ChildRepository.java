package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itamp.Model.Child;

public interface ChildRepository extends JpaRepository<Child, Long> {

}
