# Visitor Design Pattern

Visitor Design Pattern is a Behavioural Design Pattern that allows you to add new operations to existing classes without
changing their structure.

It achieves this by separating operation from the objects on which it operates.

It does double dispatch to achieve this. Double Dispatch means, method which needs to be invoked decided by the caller
object and the object passed in the argument.

## Single Dispatch vs Double Dispatch

### Example of Single Dispatch:

```java
Room obj = new DeluxeRoom();
obj.accept();
```

Here, accept method will be called from the class whose object is used. Here DeluxeRoom.

### Example of Double Dispatch:

```java
Room obj = new DeluxeRoom();
RoomVisitor visitor = new RoomPricingVisitor();
obj.accept(visitor);
```

Here, method to be invoked i.e accept() depends upon 2 objects. One is caller and another is argument.

## Visitor Design Pattern vs Strategy Design Pattern

- Strategy Pattern is used to separate out algorithm. And Visitor Pattern is used to separate out operation. 
- Algorithms are independent of each-other. They have separate structure and logic. While operation remains same between
the classes. For example, visit() method in our project.
