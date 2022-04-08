package ru.gb.javaCore1;

public class AnimalApp {

    public static void main(String[] args) {

        int animalsMade = 0;
        int dogMade = 0;
        int catMade = 0;

        Animal[] animals = new Animal[]{

                new Dog("Бобик"),
                new Cat("Барсик"),
                new Dog("Шарик"),
                new Cat("Рыжик"),
                new Animal("Неизвестный")
        };

        for (int i = 0; i < animals.length; i++) {
            animals[i].run(200);
            animals[i].swim(10);

        }

        for (Animal pets : animals) {
            if (pets.equals(new Dog(pets.getName())) == true) {
                dogMade++;
            }

        }
        System.out.printf("\nБыло создано %d, собак", dogMade);


    }
}
