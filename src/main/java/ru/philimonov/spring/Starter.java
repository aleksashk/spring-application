package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
            System.out.println(classicalMusic.getSong());
        }
    }
}
