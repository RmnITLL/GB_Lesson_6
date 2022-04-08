package ru.gb.javaCore1;

public class Dog extends Animal {


    public Dog(String name) {
        super(name);
    }


    public void run(int runDistance) {
        if (runDistance > 500) {
            System.out.println("Эти собаки не умеют бегать больше 500 м. Введите другие параметры.");
        } else if (runDistance < 0) {
            System.out.println("Этим собакам нужно бегать. Введите другие параметы.");
        } else {
            System.out.println("\n" + getName() + " пробежал " + runDistance + " м.");
        }
    }

    public void swim(int swimDistance) {
        if (swimDistance > 10) {
            System.out.println(getName() + " не проплывет больше 10 м, пожалейте его, " +
                    "введите параметры больше 0 и не больше 10");
        } else {
            System.out.printf("%s  проплыл %d м.\n", this.getName(), swimDistance);
        }
    }

}
