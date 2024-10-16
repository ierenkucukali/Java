public class Motorcycle extends Vehicle {
    private double engineDisplacement;

    public Motorcycle(String plateNumber, String maker, String model, Person owner, double engineDisplacement) {
        super(plateNumber, maker, model, owner);
        this.engineDisplacement = engineDisplacement;
    }

    @Override
    public double calculateTax() {
        return engineDisplacement * 0.10;
    }
}