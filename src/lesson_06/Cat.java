package lesson_06;

public class Cat extends Animal {

    public Cat() {
        MAX_DISTANCE_RUN = 200;
        MAX_HEIGHT_JUMP = 2;
        MAX_DISTANCE_SWIM = 0;
    }

    public boolean run(double distance) {
        return super.move(distance, MAX_DISTANCE_RUN, 60);
    }

    public boolean jump(double height) {
        return super.move(height, MAX_HEIGHT_JUMP, 1);
    }

    public boolean swim(double distance) {
        return false;
    }
}
