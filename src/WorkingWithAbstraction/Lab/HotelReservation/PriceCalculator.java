package WorkingWithAbstraction.Lab.HotelReservation;

public class PriceCalculator {
    private double pricePerDay;
    private int day;
    private Seasons season;
    private DiscountType discountType;

    public PriceCalculator(double pricePerDay, int day, Seasons season, DiscountType discountType) {
        this.pricePerDay = pricePerDay;
        this.day = day;
        this.season = season;
        this.discountType = discountType;
    }
    public double calculate(){
       return this.pricePerDay*this.day*this.season.getPriceFactor()*this.discountType.getDiscount();
    }
}
