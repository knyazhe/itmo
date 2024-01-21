package mypokemons;


import mymoves.NobleRoar;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Wailord extends Wailmer {
    public Wailord(String name, int level) {
        super(name, level);
        this.setStats(170, 90, 45, 90, 45, 60);
        this.addMove(new NobleRoar());
    }
}
