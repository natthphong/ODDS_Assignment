package model;

import java.util.Random;

public class Hufflepuff implements Hogwarts {

    private String name;
    private String nameWand;

    public Hufflepuff(String name) {
        this.name = name;
        setNameWand();
    }

    public void Skill() {
        System.out.print("Confringo!!!!");
    };

    public void printHouse() {
        System.out.println("*".repeat(50));
        System.out.println("*Student Name : " + name + "\n*House : Hufflepuff || WAND : "+nameWand);
        System.out.println("*".repeat(50));
    };

    public void setNameWand() {
        Random rand = new Random();
        this.nameWand = WAND[rand.nextInt(7)];
    }

    public String getNameWand() {
        return nameWand;
    }

    public String getName() {
        return name;
    }

    public String getHouse() {
        return "Hufflepuff";
    }
}