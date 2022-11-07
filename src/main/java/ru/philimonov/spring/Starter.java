package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Music music = context.getBean("rockMusic", Music.class);

            MusicPlayer musicPlayer = new MusicPlayer(music);

            musicPlayer.playMusic();
        }
    }
}
