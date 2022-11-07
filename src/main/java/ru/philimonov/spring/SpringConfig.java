package ru.philimonov.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.philimonov.spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

}
