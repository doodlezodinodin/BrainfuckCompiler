package brainfuckCompiler.impl.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AddCommandFactory {

    private final Map<String, Command> commands = new HashMap<String, Command>() {{
        put("+", new AddCommand());
        put("-", new AddCommand());
    }};


    public Command getCommands(String representation) {
        return commands.get(representation);
    }

    public Set<String> getRepresentations() {
        return commands.keySet();
    }

}
