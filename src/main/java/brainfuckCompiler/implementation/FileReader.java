package brainfuckCompiler.implementation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileReader {

    private final String filePath;

    public FileReader(String filePath) {
        this.filePath = filePath;
    }

    public String reading() {

        String code = "";

        try (Scanner scanner = new Scanner(new File(filePath))) {

            while (scanner.hasNext()) code += scanner.next();
            scanner.close();

        } catch (IOException e) {

        }
        return code;
    }
}
