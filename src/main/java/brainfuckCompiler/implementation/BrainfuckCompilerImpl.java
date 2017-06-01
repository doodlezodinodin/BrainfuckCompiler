package brainfuckCompiler.implementation;

import brainfuckCompiler.BrainfuckCompiler;

public class BrainfuckCompilerImpl implements BrainfuckCompiler {

    @Override
    public void evaluate(String filePath) {

        String code = new FileReader(filePath).reading();

        System.out.println(code);

    }
}
