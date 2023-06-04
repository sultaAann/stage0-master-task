package com.epam.OOP;

public class Bird extends Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Bird(String color, int numberOfPaws, boolean hasFur) {
        super(color, numberOfPaws, hasFur);
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription() {
        String paw = numberOfPaws > 1 ? "paws": "paw";
        return String.format("This animal is mostly %s." +
                " It has %d %s and %s fur." +
                " Moreover, it has 2 wings and can fly.", color, numberOfPaws, paw, (hasFur == true) ? "a" : "no");
    }
}
