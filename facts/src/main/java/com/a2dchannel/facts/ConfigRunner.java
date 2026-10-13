package com.a2dchannel.facts;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConfigRunner implements CommandLineRunner {

    @Value("${app.name:}")
    private String appName;

    public String getName(){
System.out.println("App name is printed: "+appName);
        return appName;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("This is the run method of the commandLine Interface: "+appName);
    }
    

}
