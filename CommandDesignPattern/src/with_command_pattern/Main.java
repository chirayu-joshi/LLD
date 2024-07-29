package with_command_pattern;

public class Main {
    public static void main(String[] args) {
        AirConditioner airConditioner = new AirConditioner();
        MyRemoteControl remote = new MyRemoteControl();

        remote.setCommand(new TurnACOnCommand(airConditioner));
        remote.pressButton();

        remote.undo();
    }
}
