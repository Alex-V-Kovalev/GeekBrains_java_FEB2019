package lesson_05.computer;

public class Hdd extends ComputerParts {
    private String model;
    private String type;
    private int speed;

    public Hdd(String vendor, String model, String type, int speed) {
        this.vendor = vendor;
        this.model = model;
        this.type = type;
        this.speed = speed;
    }
}
