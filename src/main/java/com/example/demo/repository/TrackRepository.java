package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Track;

public interface TrackRepository extends JpaRepository<Track, Long> {
    List<Track> findByArtist(String artist);
    List<Track> findByTitle(String title);
}
