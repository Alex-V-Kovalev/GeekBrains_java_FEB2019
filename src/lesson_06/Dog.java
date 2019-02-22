package lesson_06;

public class Dog extends Animal {

    public Dog() {
        MAX_DISTANCE_RUN = 500;
        MAX_HEIGHT_JUMP = 0.5;
        MAX_DISTANCE_SWIM = 10;
    }

    public boolean run(double distance) {
        return super.move(distance, MAX_DISTANCE_RUN, 200);
    }

    public boolean jump(double height) {
        return super.move(height, MAX_HEIGHT_JUMP, 0.2f);
    }

    public boolean swim(double distance) {
        return super.move(distance, MAX_DISTANCE_SWIM, 2f);
    }

}
