package mypokemons;

import mymoves.Amnesia;
import mymoves.Confide;
import mymoves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wailmer extends Pokemon {
    public Wailmer(String name, int level) {
        super(name, level);
        this.setStats(130, 70, 35, 70,  35, 60);
        this.setType(Type.WATER);
        this.setMove(new Swagger(), new Confide(), new Amnesia());
    }
}
