package com.example.momcare.service;

import com.example.momcare.models.Tracking;
import com.example.momcare.repository.TrackingRepository;
import org.springframework.stereotype.Service;

@Service
public class TrackingService {
    TrackingRepository trackingRepository;

    public TrackingService (TrackingRepository trackingRepository){
        this.trackingRepository = trackingRepository;
    }

    public Tracking findTrackingByWeek(int week){return this.trackingRepository.findTrackingByWeek(week);}
}
