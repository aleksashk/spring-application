package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            MusicPlayer player = context.getBean("musicPlayer", MusicPlayer.class);
            player.playMusic();
            System.out.println("Name: " + player.getName());
            System.out.println("Volume: " + player.getVolume());
        }
    }
}
