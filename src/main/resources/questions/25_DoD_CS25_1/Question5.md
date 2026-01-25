## Question 5

![q5](q5_oop.png)
The **Owner** class represents a vehicle owner, storing their name and a list of owned vehicles. The `addVehicle` method adds a vehicle to the list if it is not already present. The `move` method moves a specified vehicle using the given speed and distance via the `move` method of the **Vehicle** class.

The **Vehicle** class represents any type of vehicle, storing its brand, type, model, color, and total accumulated distance (initialized to 0). The `printInfo` method displays vehicle details. The `move` method is abstract and must be implemented by concrete subclasses.

The **Car** class is a concrete subclass of *Vehicle* with additional attributes: id, consumption rate, and power consumption (initialized to 0). Upon creation, it sets the type as "Car." The `move` method updates the total distance and calculates power consumption as:

power comsumption = distance / comsumption rate

If speed is , no update occurs. The `printInfo` method extends *Vehicle’s* `printInfo` by also displaying total power consumption.

The **Bicycle** class is another concrete subclass of **Vehicle**, setting its type as "Bicycle" upon creation. Its `move` method updates the total distance unless the speed is , in which case no changes occur.

The provided outline includes a structural guide. **Do not modify the VehicleTester class**, as changes may cause errors.