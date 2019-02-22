package lesson_06;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        double distance;

        for (int i = 0; i < 20; i++) {
            Animal animal;
            if (rnd.nextInt(2) == 0) {
                animal = new Dog();
            } else {
                animal = new Cat();
            }
            switch (rnd.nextInt(3)) {
                case 0:
                    distance = rnd.nextDouble() * 3;
                    System.out.println(animal.getClass().getSimpleName() + " jump(" + String.format("%.3f", distance) + "):" + animal.jump(distance));
                    break;
                case 1:
                    distance = rnd.nextDouble() * 1000;
                    System.out.println(animal.getClass().getSimpleName() + " run(" + String.format("%.3f", distance) + "):" + animal.run(distance));
                    break;
                case 2:
                    distance = rnd.nextDouble() * 15;
                    System.out.println(animal.getClass().getSimpleName() + " swim(" + String.format("%.3f", distance) + "):" + animal.swim(distance));
                    break;
            }

        }
    }
}

