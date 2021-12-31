package com.configproperties.ApplicationProperty.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("default")

@Component
public class DefaultDataSource implements DataSourceTestInteface{
    @Override
    public void test() {
        System.out.println("This is DefaultDataSource.. ");
    }
}
