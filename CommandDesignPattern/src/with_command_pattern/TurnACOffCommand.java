package with_command_pattern;

public class TurnACOffCommand implements CommandInterface {
    AirConditioner ac;

    TurnACOffCommand(AirConditioner ac) {
        this.ac = ac;
    }

    @Override
    public void execute() {
        ac.turnOffAc();
    }

    @Override
    public void undo() {
        ac.turnOnAc();
    }
}
