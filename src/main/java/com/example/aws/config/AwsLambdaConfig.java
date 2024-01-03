package com.example.aws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Supplier;

@Configuration
public class AwsLambdaConfig {

    @Bean(name="Saludar")
    public Supplier<String> greeting(){
        return() -> "Hello world";  // Funcion Suplied
    }
}
