# Builder Design Pattern

## Problem which Builder Pattern tries to solve:
- In a class having many properties, some of which are optional, some of them are mandatory.
- The constructor will have so many parameters, and many of them are optional.
- You can have more than one constructor, but that list will also be large. And if you have multiple constructors, they
might have conflicts in parameter argument types. Ex. constructor(int age, int pin) with constructor(int age, int phone)

Builder Design Pattern is a creational design pattern. And it creates object step by step.

This patten has a builder class which has same properties as it's built class.

The builder class will have only setters and a build() method which returns built class with the existing set
properties. The setter methods return reference to the current builder class.

You can optionally have a Directory class which helps to invoke builder setters and create a built class for you.

## Builder Pattern vs Decorator Pattern
- Builder Pattern is a creational design pattern. While Decorator Pattern is a structural design pattern.
- Structural design pattern helps you in constructing complex objects with the help of small objects. While creational
design pattern helps in creating an object.
- Ex. With Decorator Pattern, you can create a pizza object and add toppings like cheese, mushroom, etc at run time.
But with Builder Pattern, you can create interface/abstract class and then create builders like Cheesy7Pizza,
English Retreat Pizza, etc. 