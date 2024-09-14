package com.irmaktekin.spring_boot_app.common;

import org.springframework.stereotype.Component;

@Component
public class BaseballCoach implements Coach {
    public BaseballCoach(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "From BaseballCoach!!";
    }
}
