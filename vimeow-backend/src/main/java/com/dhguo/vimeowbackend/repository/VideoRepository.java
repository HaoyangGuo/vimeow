package com.dhguo.vimeowbackend.repository;

import com.dhguo.vimeowbackend.models.Video;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {

    @EntityGraph(attributePaths = {"user", "comments", "likes"})
    Optional<Video> findById(Long id);
}
