# Recap OOP / Remember encapsulation?

##  Assignment 1: Create a simple car class
Create a class `Car` with just one method `drive(int kilometers)`. The total number of kilometers must be stored within
the car for future references.

Determine what potential problems could be with the `drive` method in regard to the _state of the object_ and provide
a solution for this problem in your code.

Also implement a `toString()` method to display the current _state_ of the car.

### Example
After `drive(25)`: `The car has driven 25 km.`

## Assignment 2: Introducing fuel
Adjust your `Car` class to include the concept of "fuel". You may assume that for every liter of fuel, the car can drive
20 kilometers (a.k.a. 1:20 ratio). Also, all cars have a maximum amount of liters the tank of the car can hold (that is
set via the constructor). Implement a `refuel(int liters)` method to allow the car to be refueled.

Similar as with assignment 1, identify the possible problems with _the state of the object_ that these introductions can
cause and implement a solution for these problems. 

Finally, update to `toString()` method to show the contents of the tank.

### Example
After `drive(20)`, with a tank size of 40 liters: `The car has driven 20 km. The tank currently holds 39 liters.`

## Assignment 3: Setting the efficiency.
So far, the efficiency is set to 1:20. Obviously this differs from car to car, so we want to be able to set the 
car's efficiency whenever a car is created (e.g. via the constructor).

Make sure you implement the change mentioned above, while making sure the state of the car will always be valid.

Update your `toString()` to show your implemented change.

## Assignment 4: Adding a license plate.
The final part is to give your car a license plate. As of 2019, each license plate in the Netherlands has the following
form: "123-AB-1" (3 digits, 2 letters, 1 digit, hyphenated) and must be set when a new car is created (constructor). 

License plates also can be stolen or damaged, sometimes resulting in the need for a replacement number, so implement 
a setter for the license plate as well.

Once again notice where the _state of the object_ could be invalidated and make sure you prevent this from happening.

