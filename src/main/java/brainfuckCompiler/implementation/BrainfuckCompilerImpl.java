package brainfuckCompiler.implementation;

import brainfuckCompiler.BrainfuckCompiler;

public class BrainfuckCompilerImpl implements BrainfuckCompiler {

    @Override
    public void evaluate(String filePath) {

        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("The path to the file is null or empty.");
        }

        String code = new FileReader(filePath).reading();

        if (code == null || code.isEmpty()) {
            throw new IllegalArgumentException("File is null or empty.");
        }

        System.out.println(code);

    }
}
