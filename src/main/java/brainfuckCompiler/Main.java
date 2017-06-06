package brainfuckCompiler;

import brainfuckCompiler.impl.BrainfuckCompilerImpl;

public class Main {

    public static void main(String[] args) throws EvaluationException {

        BrainfuckCompiler compiler = new BrainfuckCompilerImpl();
        compiler.evaluate("res//program00.txt");
    }
}
