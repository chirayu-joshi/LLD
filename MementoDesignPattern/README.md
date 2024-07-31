# Memento Design Pattern or Snapshot Design Pattern

Memento Design Pattern is a Behavioural Design Pattern. It provides an ability to revert an object to a previous state
i.e. UNDO capability. And it does not expose the object internal implementation.

## Major Component in Memento Design Pattern

1. Originator
2. Memento
3. Caretaker

### Originator:

- It represents the object, for which state needs to be saved and restored.
- Expose methods to save and restore its state using Memento object.

### Memento:

- It represents an object which holds the state of the originator.

### Caretaker:

- It manages the list of states (i.e. list of memento)
