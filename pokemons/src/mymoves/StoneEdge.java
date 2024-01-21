package mymoves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class StoneEdge extends PhysicalMove {
    public StoneEdge() {
        super(Type.ROCK, 100, 80);
    }

    @Override
    protected String describe() {
        return "использует Stone Edge";
    }
}