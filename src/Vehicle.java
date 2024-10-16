public abstract class Vehicle {
    protected String plateNumber;
    protected String maker;
    protected String model;
    protected Person owner;

    public Vehicle(String plateNumber, String maker, String model, Person owner) {
        this.plateNumber = plateNumber;
        this.maker = maker;
        this.model = model;
        this.owner = owner;
    }

    // Abstract method to calculate tax (each vehicle type has its own way)
    public abstract double calculateTax();

    // Getters and setters for vehicle attributes
}