package com.irmaktekin.spring_boot_app.config;

import com.irmaktekin.spring_boot_app.common.Coach;
import com.irmaktekin.spring_boot_app.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {
    @Bean("aquatic")
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
