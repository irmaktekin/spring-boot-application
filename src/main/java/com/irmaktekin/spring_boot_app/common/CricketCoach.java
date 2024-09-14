package com.irmaktekin.spring_boot_app.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach(){
        System.out.println(getClass().getSimpleName());
    }

    //define init method
   @PostConstruct
   public void startUp() {
       System.out.println("Start up for the given class");
   }

    //define destroy method
    @PreDestroy
    public void cleanUp(){
        System.out.println("Clean up stuff");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes!!!!";
    }
}
