package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.EvaluationException;
import brainfuckCompiler.impl.command.Command;

public class CommandLexeme implements Lexeme {

    private final Command command;

    public CommandLexeme(Command command) {
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
