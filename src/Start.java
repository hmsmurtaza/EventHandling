public class Start {


    public static void main(String[] args) {
        Game game = new Game();
        game.addDamageTakenListener(new DamageTakenListener());
        game.takeDamage(25);
        game.takeDamage(25);
    }
}
