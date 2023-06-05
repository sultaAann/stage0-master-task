package com.epam.OOP;

public class Dog extends Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    @Override
    public String getDescription() {
        String paw = numberOfPaws > 1 ? "paws": "paw";
        return String.format("This animal is mostly %s." +
                " It has %d %s and %s fur.", color, numberOfPaws, paw, (hasFur == true) ? "a" : "no");
    }

    public Dog(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public Dog() {
    }


}

