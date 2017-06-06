package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.impl.command.Command;

import java.util.HashMap;
import java.util.Map;

public class LexemeFactory {

    private Command command;

    public LexemeFactory(Command command) {
        this.command = command;
    }

    private final Map<String, Lexeme> lexemes = new HashMap<String, Lexeme>() {{

        put("<", new ShiftLexeme(command));
        put(">", new ShiftLexeme(command));
        put("+", new AddLexeme(command));
        put("-", new AddLexeme(command));
        put(".", new OutLexeme(command));
        put("[", new CycleStartLexeme(command));
        put("]", new CycleEndLexeme(command));

    }};

    public Lexeme createLexeme(String representation) {
        return lexemes.get(representation);
    }

}
