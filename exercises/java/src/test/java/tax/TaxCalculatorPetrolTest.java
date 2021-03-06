package tax;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.time.LocalDate;

import static java.time.Month.JANUARY;
import static org.assertj.core.api.Assertions.assertThat;
import static tax.FuelType.PETROL;

//@Ignore
public class TaxCalculatorPetrolTest {

    private static final LocalDate FIRST_OF_JAN_2019 = LocalDate.of(2019, JANUARY, 1);
    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        taxCalculator = new DefaultTaxCalculator();
    }

    @Test
    public void firstYearsTaxForPetrol_0_grams_co2() {
        Vehicle vehicle = new Vehicle(0, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }

    @Ignore
    //@Test
    public void firstYearsTaxForPetrol_1_to_50_grams_co2() {
        Vehicle vehicle = new Vehicle(50, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(10);
    }

    @Ignore
    //@Test
    public void firstYearsTaxForPetrol_51_to_75_grams_co2() {
        Vehicle vehicle = new Vehicle(75, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(25);
    }

    @Ignore
    //@Test
    public void firstYearsTaxForPetrol_76_to_90_grams_co2() {
        Vehicle vehicle = new Vehicle(90, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(105);
    }

    @Ignore
    //@Test
    public void firstYearsTaxForPetrol_91_to_100_grams_co2() {
        Vehicle vehicle = new Vehicle(100, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(125);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_101_to_110_grams_co2() {
        Vehicle vehicle = new Vehicle(110, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(145);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_111_to_130_grams_co2() {
        Vehicle vehicle = new Vehicle(130, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(165);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_131_to_150_grams_co2() {
        Vehicle vehicle = new Vehicle(150, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(205);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_151_to_170_grams_co2() {
        Vehicle vehicle = new Vehicle(170, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(515);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_171_to_190_grams_co2() {
        Vehicle vehicle = new Vehicle(190, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(830);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_191_to_225_grams_co2() {
        Vehicle vehicle = new Vehicle(225, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(1240);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_226_to_255_grams_co2() {
        Vehicle vehicle = new Vehicle(255, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(1760);
    }

    @Ignore
//    @Test
    public void firstYearsTaxForPetrol_over_255_grams_co2() {
        Vehicle vehicle = new Vehicle(256, PETROL, FIRST_OF_JAN_2019, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(2070);
    }
}
