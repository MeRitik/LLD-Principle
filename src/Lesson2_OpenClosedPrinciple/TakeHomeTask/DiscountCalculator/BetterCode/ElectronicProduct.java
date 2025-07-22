package Lesson2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculator.BetterCode;

public class ElectronicProduct implements Product {
    private final double price;

    public ElectronicProduct(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return 0.10; // 10% discount
    }
}
