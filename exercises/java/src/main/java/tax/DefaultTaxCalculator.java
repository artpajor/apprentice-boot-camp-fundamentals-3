package tax;

import java.time.LocalDate;

public class DefaultTaxCalculator extends TaxCalculator {
    private Vehicle vehicle;

//    public DefaultTaxCalculator(Vehicle vehicle) {
//        this.vehicle = new Vehicle(int co2Emissions, FuelType fuelType, LocalDate dateOfFirstRegistration, int listPrice);
//    }

    public int calculateTax(Vehicle vehicle) {
        return 0;
    }
}
