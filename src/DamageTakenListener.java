public class DamageTakenListener implements DamageTakenEvent{
    @Override
    public void onDamageTaken(int before, int after) {
        System.out.println("You took damage. Before it was " + before + ", now it is " + after);
    }
}
