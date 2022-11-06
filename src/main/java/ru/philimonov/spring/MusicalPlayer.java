package ru.philimonov.spring;

public class MusicalPlayer {
    private  Music music;

    public MusicalPlayer(Music music) {
        this.music = music;
    }

    public void playMusic(){
        System.out.println("Playing: " + music.playMusic());
    }
}
