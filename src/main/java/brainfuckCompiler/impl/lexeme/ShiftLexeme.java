package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.EvaluationException;
import brainfuckCompiler.impl.command.Command;

public class ShiftLexeme implements Lexeme {

    private final Command command;

    public ShiftLexeme(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    @Override
    public void acceptVisitor(LexemeVisitor visitor) throws EvaluationException {
        visitor.visit(this);
    }
}
