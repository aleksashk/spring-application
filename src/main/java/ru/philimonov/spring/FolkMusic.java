package ru.philimonov.spring;

public class FolkMusic implements Music{
    @Override
    public String playMusic() {
        return "Playing some folk music";
    }
}
