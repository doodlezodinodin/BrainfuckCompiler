package brainfuckCompiler.implementation;

import brainfuckCompiler.BrainfuckCompiler;
import brainfuckCompiler.impl.BrainfuckCompilerImpl;
import org.junit.Test;

import static org.junit.Assert.*;

public class BrainfuckCompilerImplTest {

    private final BrainfuckCompiler compiler = new BrainfuckCompilerImpl();

    @Test
    public void evaluateEmptyFilePath() {
        try {
            compiler.evaluate("");
            fail();
        } catch (IllegalArgumentException e) {
            //throw new IllegalArgumentException("The path to the file is null or empty.");
        }
    }
}