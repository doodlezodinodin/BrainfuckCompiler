package brainfuckCompiler;

import brainfuckCompiler.impl.BrainfuckCompilerImpl;

public class Main {

    public static void main(String[] args) {

        BrainfuckCompiler compiler = new BrainfuckCompilerImpl();
        compiler.evaluate("res//BrainfuckProgram00.txt");
    }
}
