package observer.observer;

public class ConcreteObserverA implements Observer {
    @Override
    public void notify(String message) {
        System.out.println(this.getClass() + " received " + message);
    }
}
