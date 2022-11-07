package ru.philimonov.spring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    private List<String> playList = new ArrayList<>();

    {
        playList.add("Hungarian Rhapsody");
        playList.add("Symphony no. 5 in C Minor, op. 67");
        playList.add("Night on Bald Mountain");
    }

    @Override
    public List<String> getSongs() {
        return playList;
    }
}
