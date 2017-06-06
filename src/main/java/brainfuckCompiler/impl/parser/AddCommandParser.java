package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.ProgramCodeReader;
import brainfuckCompiler.impl.command.AddCommandFactory;
import brainfuckCompiler.impl.command.Command;
import brainfuckCompiler.impl.lexeme.Lexeme;
import brainfuckCompiler.impl.lexeme.ShiftLexeme;

public class AddCommandParser implements ProgramCodeParser {

    private final AddCommandFactory factory = new AddCommandFactory();

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

                return new ShiftLexeme(command);
            }

        }

        return null;
    }
}
