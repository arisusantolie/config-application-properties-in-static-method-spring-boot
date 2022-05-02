package com.example.demo.utils;

import com.example.demo.config.AppPropertiesStatic;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

public class Utils {

    public static String processStatic(){
        //process logic

        //call Class to get config value
        String configValue= AppPropertiesStatic.getConfigValue();

        return configValue;
    }
}
