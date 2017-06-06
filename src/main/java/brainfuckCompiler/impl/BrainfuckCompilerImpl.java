package brainfuckCompiler.impl;

import brainfuckCompiler.BrainfuckCompiler;
import brainfuckCompiler.EvaluationException;
import brainfuckCompiler.impl.lexeme.Lexeme;
import brainfuckCompiler.impl.parser.ParserFactory;
import brainfuckCompiler.impl.parser.ProgramCodeParser;

public class BrainfuckCompilerImpl implements BrainfuckCompiler {

    private final TransitionMatrix matrix = new TransitionMatrix();

    private final ParserFactory parserFactory = new ParserFactory();

    @Override
    public void evaluate(String filePath) throws EvaluationException {

        if (filePath == null || filePath.isEmpty()) {
            throw new IllegalArgumentException("The path to the file is null or empty.");
        }

        final String programCode = new FileReader(filePath).reading();

        if (programCode == null || programCode.isEmpty()) {
            throw new IllegalArgumentException("File is null or empty.");
        }

        System.out.println("[Program code]: " + programCode);

        final EvaluationVisitor visitor = new EvaluationVisitor(new ProgramCodeReader(programCode));

        State state = State.START;

        while (state != State.FINISH) {

            state = moveForward(state, visitor);

            if (state == null) {
                throw new EvaluationException("Invalid expression format. [error position: " + visitor.getReader().getParsePosition() + "]", visitor.getReader().getParsePosition());
            }

            //System.out.println("State: " + state);

        }

    }

    private State moveForward(State currentState, EvaluationVisitor visitor) throws EvaluationException {

        for (State possibleState : matrix.getPossibleTransitions(currentState)) {

            final ProgramCodeParser parser = parserFactory.getParser(possibleState);
            final Lexeme lexeme = parser.parse(visitor.getReader());

            if (lexeme != null) {

                lexeme.acceptVisitor(visitor);
                return possibleState;
            }
        }

        return null;
    }

}
