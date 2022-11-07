package ru.philimonov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml")) {

            MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
            MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

            System.out.println("firstMusicPlayer == secondMusicPlayer: " + (firstMusicPlayer == secondMusicPlayer));

            System.out.println(firstMusicPlayer);
            System.out.println(secondMusicPlayer);

            firstMusicPlayer.setVolume(10);

            System.out.println(firstMusicPlayer.getVolume());
            System.out.println(secondMusicPlayer.getVolume());
        }
    }
}
