package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.ProgramCodeReader;
import brainfuckCompiler.impl.command.Command;
import brainfuckCompiler.impl.command.ShiftCommandFactory;
import brainfuckCompiler.impl.lexeme.Lexeme;
import brainfuckCompiler.impl.lexeme.ShiftLexeme;

public class ShiftCommandParser implements ProgramCodeParser {

    private final ShiftCommandFactory factory = new ShiftCommandFactory();

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
