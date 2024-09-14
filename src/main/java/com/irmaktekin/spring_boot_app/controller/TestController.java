package com.irmaktekin.spring_boot_app.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    //Inject the properties for: team.name and coach.name

    @Value("${coach.name}")
    private String coachName;
    @Value("${team.name}")
    private String teamName;

    @GetMapping("/")
    public String sayHello(){
        return "Hello World";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 5k!";

    }
    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "Today is your lucky day!";

    }
    // display the information from the application properties for the team info.
    @GetMapping("/teaminfo")
    public String getTeamInfo(){
        return  "Coach name: " + coachName + " , Team name: "+ teamName;

    }

}
