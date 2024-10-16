public class DieselCar extends Vehicle {
    private double co2Emissions;

    public DieselCar(String plateNumber, String maker, String model, Person owner, double co2Emissions) {
        super(plateNumber, maker, model, owner);
        this.co2Emissions = co2Emissions;
    }

    @Override
    public double calculateTax() {
        return co2Emissions * 18;
    }
}