package notDependencyInversion;

/**
 * Created by g on 25.03.17.
 */
public class Lamp {
    private LampPlug plug = new LampPlug();

    public int getPlugSize() {
        return plug.getSize();
    }

}
