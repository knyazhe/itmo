package mymoves;


import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class TakeDown extends PhysicalMove {
    public TakeDown(){

        super(Type.NORMAL, 90, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon p)
    {
        p.setMod(Stat.SPECIAL_DEFENSE, -1);
        super.applyOppEffects(p);
    }

    @Override
    protected String describe(){
        return "использует Take Down";
    }
}
