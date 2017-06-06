package brainfuckCompiler.impl.lexeme;

public interface LexemeVisitor {

    void visit(CommandLexeme lexeme);

    void visit(FinishLexeme lexeme);

}
