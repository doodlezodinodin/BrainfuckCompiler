package brainfuckCompiler.impl;

import brainfuckCompiler.impl.lexeme.*;

public class EvaluationVisitor implements LexemeVisitor {

    private final ProgramCodeReader reader;


    private final char[] arr = new char[1000];
    private int i = 500;


    public EvaluationVisitor(ProgramCodeReader reader) {
        this.reader = reader;
    }

    public ProgramCodeReader getReader() {
        return reader;
    }

    @Override
    public void visit(CommandLexeme lexeme) {
        i++;
        System.out.println(i);
    }

    @Override
    public void visit(FinishLexeme lexeme) {

    }
}
