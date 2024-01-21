package mypokemons;

import mymoves.DoubleTeam;
import mymoves.FocusBlast;
import mymoves.Leer;
import mymoves.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Throh extends Pokemon {
    public Throh(String name, int level) {
        super(name, level);
        this.setStats(120, 100, 85, 30, 85, 45);
        this.setType(Type.FIGHTING);
        this.setMove(new FocusBlast(), new Rest(), new DoubleTeam(), new Leer());
    }
}
