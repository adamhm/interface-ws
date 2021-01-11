package com.codecool.interfacews;

public class LadyBird implements Flying, Feeding {
    private String name;
    private boolean isFemale;
    
    public LadyBird(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }
    
    @Override
    public void fly() {
        speak("Buzz, Buzz");
    }
    
    public void feed() {
        speak("I love aphid");
    }
    
    private void speak(String message) {
        System.out.println(message);
    }
}
