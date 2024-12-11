package com.comarch.szkolenia.dziedziczenie;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Puszek");
        cat.setRace("Maine coon");
        cat.setAge(10);
        cat.setCos("cos");

        Dog dog = new Dog();

        dog.setName("Reksio");
        dog.setRace("Kundel");
        dog.setAge(7);

        cat.walk();
        dog.walk();

        Snake snake = new Snake();
        snake.walk();

        Pet pet = new Cat();
        Pet pet2 = new Dog();

        Cat[] cats = new Cat[5];
        Dog[] dogs = new Dog[5];
        Snake[] snakes = new Snake[5];

        Pet[] pets = new Pet[5];
        pets[0] = new Cat();
        pets[1] = new Dog();
        pets[2] = new Snake();

        Pet x = pets[0];
        if(pets[0] instanceof Cat) {
            Cat c = (Cat) pets[0];
            c.setCos("cos");
        }

        pets[0].walk();
        pets[1].walk();
        pets[2].walk();

        Object o1 = new Cat();
        Object o2 = new Dog();
        Object o3 = new Random();
        Object o4 = "abc";
        Object o5 = 5;

        System.out.println(cat);
    }
}
