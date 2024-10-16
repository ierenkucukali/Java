import java.util.List;
import java.util.ArrayList;

public class SystemManager {
    private List<Person> persons = new ArrayList<>();
    private List<Vehicle> vehicles = new ArrayList<>();

    // Method to add a person
    public void addPerson(Person person) {
        persons.add(person);
    }

    // Method to add a vehicle
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Tax report method
    public void generateTaxReport() {
        for (Person person : persons) {
            System.out.println("Owner: " + person.getName() + " " + person.getSurname());
            double totalTax = 0;
            for (Vehicle vehicle : vehicles) {
                if (vehicle.owner == person) {
                    double tax = vehicle.calculateTax();
                    totalTax += tax;
                    System.out.println("Vehicle: " + vehicle.model + ", Tax: " + tax);
                }
            }
            System.out.println("Total Tax for " + person.getName() + ": " + totalTax);
        }
    }
}
