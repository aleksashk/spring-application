package ru.philimonov.spring;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;

    public MusicPlayer(ClassicalMusic classicalMusic, RockMusic rockMusic) {
        this.classicalMusic = classicalMusic;
        this.rockMusic = rockMusic;
    }

    public void playMusic(MusicGenre genre) {
        Random random = new Random();
        int number = random.nextInt(3);
        if (genre == MusicGenre.CLASSICAL) {
            System.out.println(classicalMusic.getSongs().get(number));
        } else {
            System.out.println(rockMusic.getSongs().get(number));
        }
    }
}
