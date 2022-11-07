package ru.philimonov.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class MusicPlayer {

    @Autowired
    private  Music music;

    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.playMusic());
    }
}