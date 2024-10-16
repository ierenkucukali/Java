public class Main {
    public static void main(String[] args) {
        // Creating a SystemManager object
        SystemManager manager = new SystemManager();

        // Create some persons
        Person person1 = new Person("12345", "John", "Doe", "123 Elm St");
        Person person2 = new Person("67890", "Jane", "Smith", "456 Oak St");

        // Add persons to the manager if required
        manager.addPerson(person1);
        manager.addPerson(person2);

        // Create some vehicles and add to manager
        Vehicle motorcycle = new Motorcycle("XYZ123", "Yamaha", "MT-07", person1, 689);
        Vehicle petrolCar = new PetrolCar("ABC456", "Toyota", "Corolla", person1, 120);
        Vehicle hybridCar = new HybridCar("DEF789", "Honda", "Civic", person2, 80);

        manager.addVehicle(motorcycle);
        manager.addVehicle(petrolCar);
        manager.addVehicle(hybridCar);

        // Generating the tax report
        manager.generateTaxReport();
    }
}
