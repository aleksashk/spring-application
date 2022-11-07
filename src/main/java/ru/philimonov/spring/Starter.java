package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            Music music = context.getBean("classicalMusic", Music.class);
            Music rockMusic = context.getBean("rockMusic", Music.class);

            MusicPlayer musicPlayer = new MusicPlayer(music);
            MusicPlayer rockMusicPlayer = new MusicPlayer(rockMusic);
            rockMusicPlayer.playMusic();
            musicPlayer.playMusic();
        }
    }
}
