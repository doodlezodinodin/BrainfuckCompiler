package brainfuckCompiler.impl.lexeme;

import brainfuckCompiler.EvaluationException;

public interface Lexeme {

    void acceptVisitor(LexemeVisitor visitor) throws EvaluationException;

}
