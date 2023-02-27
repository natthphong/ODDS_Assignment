package model;

public interface Hogwarts {
    public String[] WAND = { "Notched", "Classic", "Soft Spiral", "Spiral", "Stalk", "Ringed", "Crooked Spiral",
            "Natural" };

    abstract void Skill();

    abstract void printHouse();

    abstract String getName();

    abstract String getHouse();
}
