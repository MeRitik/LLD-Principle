package Lesson2_OpenClosedPrinciple.TakeHomeTask.VehicleInsuranceEvaluator.BetterCode;

public class VehicleInsuranceEvaluator {

    public InsuranceQuote evaluateInsurance(Vehicle vehicle) {
        if (vehicle instanceof Car) {
            // Logic for car insurance
            return new InsuranceQuote(/* some parameters */);
        } else if (vehicle instanceof Truck) {
            // Logic for truck insurance
            return new InsuranceQuote(/* some parameters */);
        }
        throw new IllegalArgumentException("Unsupported vehicle type.");
    }
}
