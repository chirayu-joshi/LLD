In decorator pattern, we have a base object; and it has some property (F1).

To add more feature in the object, we wrap that object by a decorator; and it will add additional feature (F2) on that
object.

To further add a new feature on that (F1 + F2) object, we can wrap that object by a decorator. And so on...

## Use case of Decorator Design Pattern:

- Pizza Shop: You can create a base pizza, and then add toppings, extra cheese, mushroom, jalapeño, etc. one by one on
that base pizza.
- Coffee Shop: You have a base coffee espresso, and then add cream, extra milk, soy milk, etc.
- Car Shop: You have a base car, and then add seat cover, power windows, power steering, fog light, etc.

## Why you need Decorator Pattern?

It prevents class explosion. Example: VehicleClass, ACCar, ACPowerSteeringCar, ...