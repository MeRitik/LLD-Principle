package Lesson2_OpenClosedPrinciple.TakeHomeTask.DiscountCalculator.BetterCode;


public class DiscountCalculator {
    public double calculateDiscount(Product product) {
        return product.getPrice() * product.getDiscount();
    }
}

