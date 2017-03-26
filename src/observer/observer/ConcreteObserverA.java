package observer.observer;

/**
 * Created by g on 26.03.17.
 */
public class ConcreteObserverA implements Observer {
    @Override
    public void notify(String message) {
        System.out.println(this.getClass() + " received " + message);
    }
}
