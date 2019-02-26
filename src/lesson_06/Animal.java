package lesson_06;

import java.util.Random;

public abstract class Animal {
    protected static double MAX_DISTANCE_RUN;
    protected static double MAX_HEIGHT_JUMP;
    protected static double MAX_DISTANCE_SWIM;

    private String name;

    public boolean move(double distance, double maxDistance, double delta) {
        Random rnd = new Random();

        return distance <= (maxDistance + (rnd.nextDouble() * delta - delta / 2));
    }

    public abstract boolean run(double distance);

    public abstract boolean jump(double height);

    public abstract boolean swim(double distance);

    public String getName() {
        return name;
    }
}

