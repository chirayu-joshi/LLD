package with_command_pattern;

import java.util.Stack;

public class MyRemoteControl {
    private final Stack<CommandInterface> acCommandHistory = new Stack<>();
    CommandInterface command;

    public void setCommand(CommandInterface command) {
        this.command = command;
    }

    public void pressButton() {
        this.command.execute();
        acCommandHistory.add(this.command);
    }

    public void undo() {
        if (acCommandHistory.isEmpty()) return;

        CommandInterface lastCommand = acCommandHistory.pop();
        lastCommand.undo();
    }
}
