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

    @Value("${management.endpoint.info.enabled}")
    private String managementExposed;

    @Value("${management.endpoint.web.exposure.include:**}")
    private String managementinfo;

    @Autowired
    DataSourceTestInteface dataSourceTestInteface;



    @Autowired
    ConfigurationApplicationProps configurationApplicationProps;



    @GetMapping("/greeting")
    public String getGreetings()
    {

        dataSourceTestInteface.test();
        return greetingMessage+javaRunTime+hashMapValue +configurationApplicationProps.getTestMessage()+managementExposed+managementinfo;
    }

    @GetMapping("/greetingList")
    public List<String> getListOfData()
    {
        return greetingsList;
    }

}
