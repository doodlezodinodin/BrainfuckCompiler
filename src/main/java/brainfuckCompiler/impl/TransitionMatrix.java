package brainfuckCompiler.impl;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import static brainfuckCompiler.impl.State.*;
import static java.util.EnumSet.noneOf;
import static java.util.EnumSet.of;

public class TransitionMatrix {

    private final Map<State, Set<State>> transitions = new HashMap<State, Set<State>>() {{

        put(START, of(SHIFT, ADD));

        put(SHIFT, of(SHIFT, ADD, FINISH));

        put(ADD, of(SHIFT, ADD, FINISH));

        put(FINISH, noneOf(State.class));
    }};

    public Set<State> getPossibleTransitions(State state) {
        return transitions.get(state);
    }

}
