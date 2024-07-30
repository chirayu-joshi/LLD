# Mediator Design Pattern

Mediator Design Pattern is a behavioural design pattern, and it encourages loose coupling by keeping objects from
referring to each other explicitly and allows them to communicate through a mediator object.

The objects communicate with mediator object and don't have information about each-other.

## Mediator Design Pattern vs Observer Design Pattern
- The intent of both the pattern is totally different. 
- Mediator Patterns says that two objects shouldn't communicate with each other directly, and should only communicate
via mediator. Observable Pattern says that whenever the state of an object changes, all of its observables should be
notified.

## Mediator Design Pattern vs Proxy Design Pattern
- You can argue that Proxy is kind of proxy. But their intent is totally different.
- A proxy can have a lot of processing logic in it, like validations, auth, mappings, conversion, logging, etc. While
a mediator simply passes a message or data between colleagues.
