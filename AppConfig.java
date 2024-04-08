package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // Definiamo un bean per la classe ConsoleWriter
    @Bean
    public ConsoleWriter consoleWriter() {
        return new ConsoleWriter();
    }

    // Definiamo un bean per la classe Logger e iniettiamo ConsoleWriter tramite costruttore
    @Bean
    public Logger logger() {
        return new Logger(consoleWriter());
    }
}

