package com.codecool.interfacews;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Bird1", true);
        Bird bird2 = new Bird("Bird1", false);
        LadyBird ladyBird1 = new LadyBird("LadyBird1", true);
        LadyBird ladyBird2 = new LadyBird("LadyBird2", false);
    
        List<Flying> list = List.of(bird1, bird2, ladyBird1, ladyBird2);
        list.forEach(Flying::fly);
    
        List<Feeding> list2 = List.of(bird1, bird2, ladyBird1, ladyBird2);
        list2.forEach(Feeding::feed);
    }
}
