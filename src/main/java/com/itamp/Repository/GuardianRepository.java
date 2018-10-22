package com.itamp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itamp.Model.Guardian;

public interface GuardianRepository extends JpaRepository<Guardian, Long> {
    
}
