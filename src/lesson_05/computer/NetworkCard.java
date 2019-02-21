package lesson_05.computer;

public class NetworkCard extends Card {
    public NetworkCard(String vendor, String slotType, String type) {
        super(vendor, slotType, type);
    }

    public NetworkCard(String slotType, String type) {
        super(slotType, type);
    }
}
