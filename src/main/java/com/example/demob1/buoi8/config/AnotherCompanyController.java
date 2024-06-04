package com.example.demob1.buoi8.config;

import com.example.demob1.buoi8.entity.AnotherCompany;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AnotherCompanyController {
    @Bean // Hoặc là @Bean("bean1")
    public AnotherCompany getName() {
        return new AnotherCompany("AnotherCompany");
    }

    @Bean
    @Primary
    public AnotherCompany getName2() {
        return new AnotherCompany("AnotherCompany02");
    }
}
