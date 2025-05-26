package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Track;
import com.example.demo.repository.TrackRepository;

@Service
public class TrackService {
    @Autowired
    private TrackRepository trackRepository;

    public List<Track> getTracks() {
        return trackRepository.findAll();
    }

    public Track getTrack(long id) {
        return trackRepository.findById(id).orElse(null);
    }
    
    public List<Track> getTracksByArtist(String artist) {
        return trackRepository.findByArtist(artist);
    }

    public List<Track> getTracksByTitle(String title) {
        return trackRepository.findByTitle(title);
    }

    public Track createTrack(Track track) {
        return trackRepository.save(track);
    }

    public Track deleteTrack(long id) {
        Track track = trackRepository.findById(id).orElse(null);
        if (track != null) {
            trackRepository.delete(track);
        }
        return track;
    }
    
}
