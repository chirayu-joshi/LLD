public class Main {
    public static void main(String[] args) {
        ConfigurationCareTaker careTaker = new ConfigurationCareTaker();
        // Initialise state of the originator
        ConfigurationOriginator originator = new ConfigurationOriginator(5, 10);

        // Save it
        ConfigurationMemento snapshot1 = originator.createMemento();

        // Add it to history
        careTaker.addMemento(snapshot1);

        // Originator changing to the new state
        originator.setHeight(7);
        originator.setWidth(13);

        // Save it
        ConfigurationMemento snapshot2 = originator.createMemento();

        // Add it to history
        careTaker.addMemento(snapshot2);

        // Originator changing to new state
        originator.setHeight(9);
        originator.setWidth(15);

        // Undo
        ConfigurationMemento restoredStateMemento = careTaker.undo();
        originator.restoreMemento(restoredStateMemento);

        System.out.println("Height: " + originator.getHeight() + ". Width: " + originator.getWidth());
    }
}
