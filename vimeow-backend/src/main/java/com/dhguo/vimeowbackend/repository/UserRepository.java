package com.dhguo.vimeowbackend.repository;

import com.dhguo.vimeowbackend.models.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);

    Optional<User> findById(Long id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.videos WHERE u.id = :id")
    Optional<User> findByIdWithVideos(@Param("id") Long id);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}