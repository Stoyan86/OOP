package WorkingWithAbstraction.Lab.HotelReservation;

public enum DiscountType {
    VIP(0.8),
    SecondVisit(0.9),
    None(1);

    public double getDiscount() {
        return discount;
    }

    DiscountType(double discount) {
        this.discount = discount;
    }

    private double discount;
}
