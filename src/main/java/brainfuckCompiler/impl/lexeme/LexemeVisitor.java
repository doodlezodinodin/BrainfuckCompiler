package brainfuckCompiler.impl.lexeme;

public interface LexemeVisitor {

    void visit(ShiftLexeme lexeme);

    void visit(AddLexeme lexeme);

    void visit(OutLexeme lexeme);

    void visit(CycleStartLexeme lexeme);

    void visit(CycleEndLexeme lexeme);

    void visit(FinishLexeme lexeme);

}
