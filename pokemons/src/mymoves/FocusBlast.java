package mymoves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class FocusBlast extends PhysicalMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        return "использует Focus Blast";
    }
}
