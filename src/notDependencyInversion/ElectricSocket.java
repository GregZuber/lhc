package notDependencyInversion;

/**
 * Created by g on 25.03.17.
 */
public class ElectricSocket {
    private int size = 1;

    public void connectLamp(Lamp lamp) {
        if (lamp.getPlugSize() != size) {
            throw new RuntimeException("A device can't be connected");
        }
        System.out.println("Lamp connected");
    }
}
