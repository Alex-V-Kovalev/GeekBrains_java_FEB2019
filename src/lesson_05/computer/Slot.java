package lesson_05.computer;

public class Slot {
    private String slotType;
    private boolean isEmpty;
    private Card card;

    public Slot(String slotType, boolean isEmpty, Card card) {
        this.slotType = slotType;
        this.isEmpty = isEmpty;
        this.card = card;
    }

    public String getSlotType() {
        return slotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public Card getCard() {
        return card;
    }
}
