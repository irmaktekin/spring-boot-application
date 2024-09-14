package com.irmaktekin.spring_boot_app.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{
    public TennisCoach(){
        System.out.println(getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "From tennis coach :)!!";
    }
}
