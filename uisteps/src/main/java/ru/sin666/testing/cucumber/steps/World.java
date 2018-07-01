package ru.sin666.testing.cucumber.steps;

import org.omg.CosNaming.NameHolder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Configuration
public class World {

    @Value("${my.value}")
    private String myValue;

    @Bean
    public NameH getNameH(){
        return new NameH(myValue);

    }

}
