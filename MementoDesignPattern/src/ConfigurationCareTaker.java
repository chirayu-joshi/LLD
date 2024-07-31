import java.util.ArrayList;
import java.util.List;

public class ConfigurationCareTaker {
    private final List<ConfigurationMemento> history;

    public ConfigurationCareTaker() {
        this.history = new ArrayList<>();
    }

    public void addMemento(ConfigurationMemento memento) {
        history.add(memento);
    }

    public ConfigurationMemento undo() {
        if (history.isEmpty()) return null;
        int lastMementoIndex = history.size() - 1;
        ConfigurationMemento lastMemento = history.get(lastMementoIndex);
        history.remove(lastMementoIndex);
        return lastMemento;
    }
}
