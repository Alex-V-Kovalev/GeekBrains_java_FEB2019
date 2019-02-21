package lesson_05.computer;

public class VideoCard extends Card {


    public VideoCard(String vendor, String slotType, String type) {
        super(vendor, slotType, type);
    }

    public VideoCard(String slotType, String type) {
        super(slotType, type);
    }
}
