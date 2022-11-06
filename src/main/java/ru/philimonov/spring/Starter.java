package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try(ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")){
            TestBean testBean = context.getBean("testBean", TestBean.class);
            System.out.println(testBean.getName());
        }
    }
}
