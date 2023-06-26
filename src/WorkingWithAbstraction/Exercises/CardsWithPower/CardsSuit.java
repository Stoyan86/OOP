package WorkingWithAbstraction.Exercises.CardsWithPower;

public enum CardsSuit {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);
    private int cardsSuitPower;

    public int getCardsSuitPower() {
        return cardsSuitPower;
    }

    CardsSuit(int cardsSuitPower) {
        this.cardsSuitPower = cardsSuitPower;
    }
}
