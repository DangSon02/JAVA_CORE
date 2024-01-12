package model;

import java.time.LocalDate;

public class Cat extends Pet {

    public Cat(String name, LocalDate dob) {
        super(name, dob);
    }

    public Cat() {
    }

    public void Meow() {
        System.out.println("Meow Meow!!");
    }

}
