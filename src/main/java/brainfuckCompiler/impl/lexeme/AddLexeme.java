package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.impl.command.Command;

public class AddLexeme implements Lexeme {

    private final Command command;

    public AddLexeme(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    @Override
    public void acceptVisitor(LexemeVisitor visitor) {
        visitor.visit(this);
    }
}
