package com.example.demo.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/*
Credit By : Ari Susanto Lie
website : https://arisusantolie.my.id
 */

//Don't Forget to create this class as bean in application spring class.
public class SpringBootApplicationContext implements ApplicationContextAware {

    private static ApplicationContext CONTEXT;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        CONTEXT=applicationContext;
    }

    // this method use for get bean class as object.
    public static Object getBean(String beanName){
        return CONTEXT.getBean(beanName);
    }



}
