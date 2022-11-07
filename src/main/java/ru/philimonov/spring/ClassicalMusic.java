package ru.philimonov.spring;

import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music {
    @Override
    public String playMusic() {
        return "Hungarian Rhapsody";
    }
}
