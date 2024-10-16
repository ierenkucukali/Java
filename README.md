# Vehicle Tax Management System

## Overview
This project is a **Vehicle Tax Management System** designed to manage taxes related to different types of vehicles (cars and motorcycles) and their owners. The system supports the addition, editing, and deletion of vehicles and persons, as well as calculating taxes and generating reports for vehicle owners.

### Objectives
- Manage vehicle and owner information.
- Calculate taxes based on vehicle type:
  - **Motorcycles**: 10% of engine displacement.
  - **Petrol Cars**: €14 per gram of CO2 emissions.
  - **Diesel Cars**: €18 per gram of CO2 emissions.
  - **Hybrid Cars**: €12 per gram of CO2 emissions.
- Generate a tax report for vehicle owners.
- Transfer vehicle ownership between persons.

## Features
- **Add/Edit/Delete Vehicles**: Manage vehicles in the system by plate number, maker, and model.
- **Add/Edit/Delete Persons**: Manage persons in the system by license number, name, surname, and address.
- **Calculate Taxes**: Automatically calculate taxes based on vehicle type.
- **Ownership Transfer**: Transfer ownership of a vehicle from one person to another.
- **Annual Tax Report**: Generate a list of all vehicle owners, their vehicles, and the taxes for each vehicle.

## Classes
### 1. `Person`
Represents a person in the system. Each person has:
- `licenseNumber`: A unique license number.
- `name`: First name.
- `surname`: Last name.
- `address`: Address.

### 2. `Vehicle` (Abstract Class)
An abstract class representing a vehicle. Each vehicle has:
- `plateNumber`: A unique identifier for the vehicle.
- `maker`: The manufacturer of the vehicle.
- `model`: The model of the vehicle.
- `owner`: The person who owns the vehicle.

#### Subclasses of `Vehicle`
- `Motorcycle`: Adds the `engineDisplacement` attribute and calculates tax based on 10% of engine displacement.
- `PetrolCar`: Adds the `co2Emissions` attribute and calculates tax at €14 per gram of CO2 emissions.
- `DieselCar`: Adds the `co2Emissions` attribute and calculates tax at €18 per gram of CO2 emissions.
- `HybridCar`: Adds the `co2Emissions` attribute and calculates tax at €12 per gram of CO2 emissions.

### 3. `SystemManager`
Manages the interaction between persons, vehicles, and the tax system. Key methods include:
- `addPerson()`: Adds a new person to the system.
- `addVehicle()`: Adds a new vehicle to the system.
- `transferVehicle()`: Transfers ownership of a vehicle from one person to another.
- `generateTaxReport()`: Generates a report listing each person’s vehicles and their tax obligations.

## Sequence Diagrams
- **Transfer Vehicle**: Describes the process of transferring ownership from one person to another.
- **Generate Tax Report**: Describes how the system compiles and displays tax information for all vehicle owners.

## How to Run the Project
1. Clone the repository to your local machine.
2. Import the project into your Java IDE (e.g., IntelliJ IDEA).
3. Compile and run the `Main.java` file to interact with the system.
4. Add persons and vehicles, transfer ownership, and generate tax reports.

