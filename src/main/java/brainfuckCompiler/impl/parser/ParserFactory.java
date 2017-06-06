package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.State;

import java.util.HashMap;
import java.util.Map;

import static brainfuckCompiler.impl.State.*;

public class ParserFactory {

    private final Map<State, ProgramCodeParser> parsers = new HashMap<State, ProgramCodeParser>() {{

        put(SHIFT, new ShiftCommandParser());

        put(ADD, new AddCommandParser());

        put(FINISH, new FinishParser());
    }};

    public ProgramCodeParser getParser(State state) {
        return parsers.get(state);
    }

}
