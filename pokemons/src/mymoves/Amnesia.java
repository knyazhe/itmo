package mymoves;


import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Amnesia extends StatusMove {
    public Amnesia()
    {
        super(Type.PSYCHIC,0,100);
    }
    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.setMod(Stat.SPECIAL_DEFENSE, 2);
        super.applySelfEffects(p);
    }

    @Override
    protected String describe() {
        return "использует Amnesia";
    }
}