package Lesson2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculator.BetterCode;

public class ClothingProduct implements Product {
    private final double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getDiscount() {
        return 0.20; // 20% discount
    }
}
