package mymoves;

import mypokemons.Throh;
import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {
    public Rest (){

        super(Type.PSYCHIC, 0, 100);
    }

    @Override
    protected void applySelfEffects(Pokemon p)
    {
        p.restore();
        Effect e = new Effect().condition(Status.SLEEP).turns(2);
        p.addEffect(e);
        super.applySelfEffects(p);
    }

    @Override
    protected String describe(){
        return "использует Rest";
    }
}
