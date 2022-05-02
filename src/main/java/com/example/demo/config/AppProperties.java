package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;


/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

@Component
public class AppProperties {

    /* this class will execute first as a component bean,
    where will use for return a config value from application properties in first time application load */

    @Autowired
    private Environment env;

    public String getConfigValue() {
        return env.getProperty("config-value");

    }


}
