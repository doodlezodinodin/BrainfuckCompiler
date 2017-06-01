package brainfuckCompiler;

import brainfuckCompiler.implementation.BrainfuckCompilerImpl;

public class Main {

    public static void main(String[] args) {

        BrainfuckCompiler compiler = new BrainfuckCompilerImpl();
        compiler.evaluate("res//BrainfuckProgram00.txt");
    }
}
