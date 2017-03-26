package notDependencyInversion;

/**
 * Created by g on 25.03.17.
 */
public class LampConnectTest {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        ElectricSocket electricSocket = new ElectricSocket();
        electricSocket.connectLamp(lamp);
    }
}
