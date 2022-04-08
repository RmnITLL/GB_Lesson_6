package ru.gb.javaCore1;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void run(int runDistance) {
        if (runDistance > 200) {
            System.out.println(this.getName() + " не побежит на " + runDistance + " метров," +
                    "он стар и ленив, введите для него дистанцию меньше 200 м.");
        } else {
            System.out.println(this.getName() + " пробежал " + runDistance + " м.");
        }
    }


    public void swim(int swimDistance) {

        if(swimDistance >= 0 || swimDistance <= 0)
           System.out.printf("%s не поплывет, потому-что котики не умею плавать.", this.getName());
    }
}
