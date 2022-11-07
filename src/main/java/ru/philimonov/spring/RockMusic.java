package ru.philimonov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    List<String> playList = new ArrayList<>();

    {
        playList.add("Wind cries Mary");
        playList.add("Paint it black");
        playList.add("Can't seem to make you mine");
    }

    @Override
    public List<String> getSongs() {
        return playList;
    }
}