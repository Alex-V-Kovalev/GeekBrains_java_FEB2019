package lesson_05.computer;

public class Ram {
    private String vendor;
    private String type;
    private int size;

    public Ram(String vendor, String type, int size) {
        this.vendor = vendor;
        this.type = type;
        this.size = size;
    }

    public Ram(String type, int size) {
        this.vendor = "NoName";
        this.type = type;
        this.size = size;
    }

    public String getVendor() {
        return vendor;
    }

    public String getType() {
        return type;
    }

    public int getSize() {
        return size;
    }
}
