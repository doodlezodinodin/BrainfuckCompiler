package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.command.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CommandFactory {

    private final Map<String, Command> commands = new HashMap<String, Command>() {{
        put("<", new ShiftCommand());
        put(">", new ShiftCommand());
        put("+", new AddCommand());
        put("-", new AddCommand());
        put(".", new OutCommand());
        put("[", new CycleStartCommand());
        put("]", new CycleEndCommand());
    }};


    public Command getCommands(String representation) {
        return commands.get(representation);
    }

    public Set<String> getRepresentations() {
        return commands.keySet();
    }

}
