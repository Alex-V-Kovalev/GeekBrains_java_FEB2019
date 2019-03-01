package lesson_07;

import java.util.Random;

public class Plate {
    private int food;
    private int maxFood;

    public Plate() {
        Random random = new Random();
        food = 0;
        maxFood = random.nextInt(101);
    }

    public Plate(int maxFood) {
        this.maxFood = maxFood;
    }

    public boolean decreaseFood(int food) {
        if (food > this.food)
            return false;
        else {
            this.food -= food;
            return true;
        }
    }

    public void increaseFood(int foods) {
        if (foods > 0) {
            food += foods;
            if (food > maxFood)
                food = maxFood;
        }
    }

    public int getFood() {
        return food;
    }

    public int getMaxFood() {
        return maxFood;
    }

    public void info() {
        System.out.println("Осталось еды в миске:" + food + ", вместительность миски: " + maxFood);
    }
}
