package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Track;
import com.example.demo.service.TrackService;

@RestController
public class TrackController {
    @Autowired
    private TrackService trackService;

    @GetMapping("/tracks")
    public List<Track> getTracks() {
        return trackService.getTracks();
    }

    @GetMapping("/tracks/search/artist")
    public List<Track> getTracksByArtist(@RequestParam String artist) {
        return trackService.getTracksByArtist(artist);
    }

    @GetMapping("/tracks/search/title")
    public List<Track> getTracksByTitle(@RequestParam String title) {
        return trackService.getTracksByTitle(title);
    }
    
    @PostMapping("/tracks")
    public Track createTrack(@RequestBody Track track) {
       return trackService.createTrack(track);
    }

    @DeleteMapping("/tracks/{id}")
    public Track deleteTrack(@PathVariable long id) {
        return trackService.deleteTrack(id);
    }
    
    
    
}
