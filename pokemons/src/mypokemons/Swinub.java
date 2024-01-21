package mypokemons;


import mymoves.AncientPower;
import mymoves.TakeDown;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Swinub extends Pokemon {
    public Swinub(String name, int lvl)
    {
        super(name, lvl);
        this.setStats(50,50,40,30,30,50);
        this.setType(Type.ICE, Type.GROUND);
        this.setMove(new TakeDown(), new AncientPower());
    }
}