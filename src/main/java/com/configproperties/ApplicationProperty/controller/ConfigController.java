package com.configproperties.ApplicationProperty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ConfigController {
    @Value("${grettingMessage1:defaultValue}")
    private String greetingMessage;

    @Value("${greetingMessageList}")
    private List<String> greetingsList;

    @Value("${java.runtime.name}")

    private String javaRunTime;

    @Value("#{${hashMapValue}}")
    private Map<String,String> hashMapValue;
    @Autowired
    ConfigurationApplicationProps configurationApplicationProps;



    @GetMapping("/greeting")
    public String getGreetings()
    {

        System.out.println("all Keys "+System.getProperties().stringPropertyNames());
        return greetingMessage+javaRunTime+hashMapValue +configurationApplicationProps.getTestMessage();
    }

    @GetMapping("/greetingList")
    public List<String> getListOfData()
    {
        return greetingsList;
    }

}
