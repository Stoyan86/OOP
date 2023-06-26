package WorkingWithAbstraction.Lab.HotelReservation;

public enum Seasons {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);

    public int getPriceFactor() {
        return priceFactor;
    }

    private int priceFactor;

    Seasons(int priceFactor) {
        this.priceFactor = priceFactor;
    }
}
