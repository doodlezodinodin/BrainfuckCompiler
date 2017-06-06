package brainfuckCompiler.impl.parser;

import brainfuckCompiler.impl.ProgramCodeReader;
import brainfuckCompiler.impl.lexeme.Lexeme;

public interface ProgramCodeParser {

    Lexeme parse(ProgramCodeReader reader);

}
