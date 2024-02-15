package com.dhguo.vimeowbackend.repository;

import com.dhguo.vimeowbackend.models.ERole;
import com.dhguo.vimeowbackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}

