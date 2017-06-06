package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.command.AddCommand;
import brainfuckCompiler.impl.command.Command;
import brainfuckCompiler.impl.command.OutCommand;
import brainfuckCompiler.impl.command.ShiftCommand;

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
    }};


    public Command getCommands(String representation) {
        return commands.get(representation);
    }

    public Set<String> getRepresentations() {
        return commands.keySet();
    }

}
