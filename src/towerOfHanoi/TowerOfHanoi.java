package towerOfHanoi;

public class TowerOfHanoi {
    public static void main(String[] arg) {
        TowerOfHanoi tower = new TowerOfHanoi();
        tower.move(3, 'A', 'C', 'B');
    }

    private void move(int numberOfDiscs, char from, char to, char intern) {
        if (numberOfDiscs == 1) {
            System.out.println("Moving disc 1 from " + from + " to " + to);
            return;
        }
        move(numberOfDiscs - 1, from, intern, to);
        System.out.println("Moving disc " + numberOfDiscs + " from " + from + " to " + to);
        move(numberOfDiscs - 1, intern, to, from);
    }
}
