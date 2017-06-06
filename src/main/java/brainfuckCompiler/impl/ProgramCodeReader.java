package brainfuckCompiler.impl;

import static java.lang.Character.isWhitespace;

public class ProgramCodeReader {

    private final String programCode;

    private int parsePosition = 0;

    public ProgramCodeReader(String programCode) {
        this.programCode = programCode;
    }

    public int getParsePosition() {
        return parsePosition;
    }

    public void moveParsePosition(int step) {
        parsePosition += step;
    }

    public String getRemainingExpression() {
        skipWhitespaces();
        return programCode.substring(parsePosition);
    }

    public boolean endOfExpression() {
        skipWhitespaces();
        return parsePosition >= programCode.length();
    }

    private void skipWhitespaces() {
        while (parsePosition < programCode.length() && isWhitespace(programCode.charAt(parsePosition))) {
            parsePosition++;
        }
    }
}
