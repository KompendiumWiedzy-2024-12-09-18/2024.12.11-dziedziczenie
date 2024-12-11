package com.comarch.szkolenia.dziedziczenie;

public class Snake extends Pet {

    @Override
    public void walk() {
        System.out.println("Rosna mi lapy");
        super.walk();
        System.out.println("Troche koslawo !!");
    }
}
