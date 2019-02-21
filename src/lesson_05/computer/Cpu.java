package lesson_05.computer;

public class Cpu {
    private String vendor;
    private String archtecture;
    private String type;
    private String slot;
    private int coutCore;
    private int perfomance;

    public Cpu(String vendor, String archtecture, String type, String slot, int coutCore, int perfomance) {
        this.vendor = vendor;
        this.archtecture = archtecture;
        this.type = type;
        this.slot = slot;
        this.coutCore = coutCore;
        this.perfomance = perfomance;
    }

    public String getVendor() {
        return vendor;
    }

    public String getArchtecture() {
        return archtecture;
    }

    public String getType() {
        return type;
    }

    public String getSlot() {
        return slot;
    }

    public int getCoutCore() {
        return coutCore;
    }

    public int getPerfomance() {
        return perfomance;
    }
}
