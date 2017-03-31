package observer.observer;

public class ConcreteObserverB implements Observer {
    @Override
    public void notify(String message) {
        System.out.println(this.getClass() + " received " + message);
    }
}
