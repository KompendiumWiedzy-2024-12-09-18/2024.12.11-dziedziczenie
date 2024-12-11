package com.comarch.szkolenia.dziedziczenie;

public class Pet {
    private String name;
    private int age;
    private String race;

    public Pet(String name, int age, String race) {
        this.name = name;
        this.age = age;
        this.race = race;
    }

    public Pet() {
    }

    public void walk() {
        System.out.println("ide na czterech lapach !!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Pet)) {
            return false;
        }
        Pet pet = (Pet) obj;
        return this.name.equals(pet.name) &&
                this.race.equals(pet.race) &&
                this.age == pet.age;
    }
}
