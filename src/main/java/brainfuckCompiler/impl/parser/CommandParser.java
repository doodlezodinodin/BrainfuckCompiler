package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.ProgramCodeReader;
import brainfuckCompiler.impl.command.Command;
import brainfuckCompiler.impl.lexeme.CommandLexeme;
import brainfuckCompiler.impl.lexeme.Lexeme;

public class CommandParser implements ProgramCodeParser {

    private final CommandFactory factory = new CommandFactory();

    @Override
    public Lexeme parse(ProgramCodeReader reader) {

        if (reader.endOfExpression()) {
            return null;
        }

        String remainingExpression = reader.getRemainingExpression();

        for (String representation : factory.getRepresentations()) {
            if (remainingExpression.startsWith(representation)) {

                reader.moveParsePosition(representation.length());

                final Command command = factory.getCommands(representation);

                return new CommandLexeme(command);
            }

        }

        return null;
    }
}
