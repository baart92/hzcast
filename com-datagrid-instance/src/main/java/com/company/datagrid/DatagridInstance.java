package com.company.datagrid;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.company.datagrid")
public class DatagridInstance {
    public static void main(String[] args) {
        new SpringApplicationBuilder(DatagridInstance.class).web(false).run(args);
    }
}
