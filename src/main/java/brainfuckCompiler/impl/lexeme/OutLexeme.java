package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.EvaluationException;
import brainfuckCompiler.impl.command.Command;

public class OutLexeme implements Lexeme {

    private final Command command;

    public OutLexeme(Command command) {
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
