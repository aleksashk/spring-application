package ru.philimonov.spring;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private List<Music> playList = new ArrayList<>();

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPlayList(List<Music> playList) {
        this.playList = playList;
    }

    public void playMusic() {
        for (Music music : playList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
