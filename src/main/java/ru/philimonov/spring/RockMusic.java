package ru.philimonov.spring;

public class RockMusic implements Music {
    @Override
    public String playMusic() {
        return "Wind cries Mary";
    }
}
