package lesson_05.computer;

public class Cpu extends ComputerParts{
    private String architecture;
    private String type;
    private String slot;
    private int countCore;
    private int performance;

    public Cpu(String vendor, String architecture, String type, String slot, int countCore, int performance) {
        this.vendor = vendor;
        this.architecture = architecture;
        this.type = type;
        this.slot = slot;
        this.countCore = countCore;
        this.performance = performance;
    }

    public String getVendor() {
        return vendor;
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getType() {
        return type;
    }

    public String getSlot() {
        return slot;
    }

    public int getCountCore() {
        return countCore;
    }

    public int getPerformance() {
        return performance;
    }
}
