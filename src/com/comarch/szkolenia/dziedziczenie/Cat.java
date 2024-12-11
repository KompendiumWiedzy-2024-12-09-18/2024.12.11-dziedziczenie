package com.comarch.szkolenia.dziedziczenie;

public class Cat extends Pet {
    private String cos;

    public Cat(String name, int age, String race, String cos) {
        super(name, age, race);
        this.cos = cos;
        System.out.println("Konstrukto cat !!");
    }

    public Cat() {
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    @Override
    public String toString() {
        return this.getRace() + " " + this.getName() + " " + this.getAge() + " " + this.cos;
    }
}
