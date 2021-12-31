package com.configproperties.ApplicationProperty.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevDataSource implements DataSourceTestInteface{
    @Override
    public void test() {
        System.out.println("This is DevDataSource.. ");
    }
}
