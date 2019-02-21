package lesson_05.computer;

abstract class Card extends ComputerParts {
    private String slotType;
    private String type;

    Card(String vendor, String slotType, String type) {
        this.vendor = vendor;
        this.slotType = slotType;
        this.type = type;
    }

    Card(String slotType, String type) {
        this.vendor = "NoName";
        this.slotType = slotType;
        this.type = type;
    }

    public String getSlotType() {
        return slotType;
    }

    public String getType() {
        return type;
    }
}
