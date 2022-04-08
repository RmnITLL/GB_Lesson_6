package ru.gb.javaCore1;

public class Animal {

    private String name;
    private int runDistance;
    private int swimDistance;

    public Animal(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void run(int runDistance) {
        System.out.printf("\n%s пробежал %d м.", this.name, runDistance);
    }

    public void swim(int swimDistance) {
        System.out.printf("\n%s проплыл %d м.", this.name, swimDistance);
    }

}
