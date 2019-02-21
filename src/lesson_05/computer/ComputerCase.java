package lesson_05.computer;

public class ComputerCase extends ComputerParts{
    private String type;

    public ComputerCase(String vendor, String type) {
        this.vendor = vendor;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
