# Command Design Pattern

Commend Design Pattern is a behavioural design pattern.

Let's take the use-case of remote control which can control various home appliances and with that let's understand the
problem, then we will go with this pattern.

## Problem with ```without_command_pattern``` implementation:

1. **Lack of Abstraction:** Today, process of turning on AC is simple, but if there are more steps, client has to be
aware of all that. Which is not good.
2. **Undo/Redo Functionality:** What if we want to implement the undo/redo capability. How it will be handled?
3. **Difficulty in code maintenance:** What if in the future, we have to support more commands for more devices example
bulb.

## How Command Design Pattern solves it?

It separates out the logic of:
- Receiver
- Invoker
- Command

_Client_ --> _Invoker_ --> _Command_ --> _Receiver_

In our TV remote use-case, Client is the user, Remote is the Invoker and TV is receiver. Remote will generate command
and send it to TV.
