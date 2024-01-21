import mypokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Swinub("Василий", 1);
        Pokemon p2 = new Throh("Трофим", 1);
        Pokemon p3 = new Wailord("Валентин", 1);
        Pokemon p4 = new Piloswine("Пётр", 1);
        Pokemon p5 = new Mamoswine("Максим", 1);
        Pokemon p6 = new Wailmer("Виталий", 1);
        b.addAlly(p1);
        b.addAlly(p3);
        b.addAlly(p5);
        b.addFoe(p2);
        b.addFoe(p4);
        b.addFoe(p6);
        b.go();
    }
}

