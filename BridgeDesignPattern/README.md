# Bridge Design Pattern

Bridge Pattern decouples an abstraction from its implementation so that the two can vary independently.

The problem with first example ```with_bridge``` is that you have tightly coupled methods with the classes. For example,
if you want to add a new breatheProcess for bird, but you don't want to introduce Bird class as of now, then it's not
possible.

So using bridge patten, you can create a breatheProcess for bird separately without the need to create a Bird class. The
logic of breathing process is separated out from the class.

Bridge Design Pattern is very much similar to Strategy Design Pattern. The difference lies only in the intent of their
usage.
