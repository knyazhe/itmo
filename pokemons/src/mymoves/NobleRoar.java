package mymoves;

import ru.ifmo.se.pokemon.*;

public class NobleRoar extends StatusMove {
    public NobleRoar() {
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.setMod(Stat.ATTACK, -1);
        p.setMod(Stat.SPECIAL_ATTACK, -1);
        super.applyOppEffects(p);
    }


    @Override
    protected String describe() {
        return "использует Noble Roar";
    }
}
