package ru.philimonov.spring;

public class ClassicalMusic implements Music {
    @Override
    public String playMusic() {
        return "Hungarian Rhapsody";
    }
}
