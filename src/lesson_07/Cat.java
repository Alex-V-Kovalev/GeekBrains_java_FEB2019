package lesson_07;

import java.util.Random;

public class Cat {
    private String name;
    private int appetite;
    private boolean isFull;
    private static int homelessCatIndex;
    private static Random random = new Random();

    public Cat(String name, int appetite) {
        if ("бездомный".equalsIgnoreCase(name.replace(" ", ""))) {
            this.name = "Бездомный_кот_" + String.format("%1$05d", ++homelessCatIndex);
        } else
            this.name = name;
        this.appetite = appetite;
    }

    public Cat() {
        this("Бездомный", (1 + random.nextInt(3)) * 5);
    }

    public void eat(Plate plate) {
        if (!isFull && plate.decreaseFood(appetite))
            isFull = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0)
            this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        if (appetite > 0)
            this.appetite = appetite;
    }

    public boolean getIsFull() {
        return isFull;
    }

    public void setIsFull(boolean full) {
        this.isFull = full;
    }

    public void info() {
        System.out.println("Кот по имени: " + name + ", с аппетитом: " + appetite + " сейчас " + (isFull ? "сыт" : "голоден"));
    }
}
