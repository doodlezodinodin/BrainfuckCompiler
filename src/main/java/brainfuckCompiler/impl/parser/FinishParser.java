package brainfuckCompiler.impl.parser;

import brainfuckCompiler.EvaluationException;
import brainfuckCompiler.impl.ProgramCodeReader;
import brainfuckCompiler.impl.lexeme.FinishLexeme;
import brainfuckCompiler.impl.lexeme.Lexeme;

public class FinishParser implements ProgramCodeParser {

    @Override
    public Lexeme parse(ProgramCodeReader reader) throws EvaluationException {

        if (reader.getRemainingExpression().length() > 0) {
            throw new EvaluationException("Invalid character after open bracket. [error position: " + reader.getParsePosition() + "]" , reader.getParsePosition());
        }

        return new FinishLexeme();
    }
}
