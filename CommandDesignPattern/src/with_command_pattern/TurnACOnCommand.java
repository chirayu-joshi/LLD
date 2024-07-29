package with_command_pattern;

public class TurnACOnCommand implements CommandInterface {
    AirConditioner ac;

    TurnACOnCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOnAc();
    }

    @Override
    public void undo() {
        ac.turnOffAc();
    }
}
