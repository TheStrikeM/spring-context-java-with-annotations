package org.thestrikem.springapp;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.thestrikem.springapp")
@PropertySource("classpath:main.properties")
public class SpringConfiguration {}
