import java.util.ArrayList;
import java.util.List;

public class Game {
    int health = 100;
    List<DamageTakenEvent> listeners;

    public Game() {
        listeners = new ArrayList<>();
    }

    void takeDamage(int amount) {
        health -= amount;
        for (DamageTakenEvent listener:
             listeners) {
            listener.onDamageTaken(health + amount, health);
        }
    }

    public void addDamageTakenListener(DamageTakenEvent listener) {
        listeners.add(listener);
    }
}
