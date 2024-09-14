package com.irmaktekin.spring_boot_app.controller;

import com.irmaktekin.spring_boot_app.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

    @Autowired
    public DemoController(@Qualifier("aquatic")Coach theCoach)
    {
        System.out.println(getClass().getSimpleName());
        myCoach=theCoach;
    }
   /*
    //Setter injection
    @Autowired
    public void setMyCoach(Coach myCoach) {
        this.myCoach = myCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }
}
