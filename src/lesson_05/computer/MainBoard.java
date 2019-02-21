package lesson_05.computer;

public class MainBoard extends ComputerParts{
    private String architecture;
    private String formFactor;

    private int countSlotRAM;
    private Ram[] rams = new Ram[countSlotRAM];

    private Cpu cpu;

    private int countSlots;
    private Slot[] slots = new Slot[countSlots];

    private Hdd hdd;

    public MainBoard(String vendor, String architecture, String formFactor, int countSlotRAM, Cpu cpu, int countSlots, Hdd hdd) {
        this.vendor = vendor;
        this.architecture = architecture;
        this.formFactor = formFactor;
        this.countSlotRAM = countSlotRAM;
        this.cpu = cpu;
        this.countSlots = countSlots;
        this.hdd = hdd;
    }
}
