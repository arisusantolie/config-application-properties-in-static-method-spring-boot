package com.example.demo.config;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

//this class will use as App Properties Static to get value from application properties.
public class AppPropertiesStatic {

    //this example method will use as method to get value from application properties, which can be used in static method example in Utils class
    public static String getConfigValue(){
        AppProperties appProperties=(AppProperties) SpringBootApplicationContext.getBean("appProperties");
        return appProperties.getConfigValue();
    }



}
