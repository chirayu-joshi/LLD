# Flyweight Design Pattern

Flyweight Design Pattern is one of the Structural Design Pattern. This pattern helps to reduce memory usage by sharing
data among multiple objects.

## Problem:
You are creating a game which has thousands of human robots and thousands of dog robots in its army. Each robot will
have a sprite object (A sprite is a 2d bitmap image). So, it will consume a lot of memory. Suppose that you have 1 lakh
robots in your game, then it will require GBs of memory.

## When to use this pattern:
- When memory is limited.
- When Objects shared data.
  - Intrinsic data: shared among objects and remain same once defined one value.
  - Extrinsic data: changes based on client input and differs from one object to another.
- Creation of Object is expensive.

## How it solves the problem:
- From the object, remove all the extrinsic data and keep intrinsic data (this object is called Flyweight object).
- This Flyweight Class can be immutable.
- Extrinsic Data can be passed to the Flyweight class in method parameter.
- Once the Flyweight object is created, it is cached and reused wherever required.
