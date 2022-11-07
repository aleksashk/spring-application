package ru.philimonov.spring;

public class ClassicalMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    protected Long doMyInit(){
        System.out.println("Doing my initialization");
        return Long.MAX_VALUE;
    }

    private Object doMyDestroy(){
        System.out.println("Doing my destruction");
        return new Object();
    }
}
