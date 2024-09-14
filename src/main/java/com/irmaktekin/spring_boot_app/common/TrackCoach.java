package com.irmaktekin.spring_boot_app.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "From TrackCoach!!!";
    }
}
