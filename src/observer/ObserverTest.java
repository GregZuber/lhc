package observer;

import observer.observer.ConcreteObserverA;
import observer.observer.ConcreteObserverB;
import observer.subject.Subject;

/**
 * Created by g on 26.03.17.
 */
public class ObserverTest {
    public static void main(String[] args) {
        ConcreteObserverA concreteObserverA = new ConcreteObserverA();
        ConcreteObserverB concreteObserverB = new ConcreteObserverB();

        Subject subject = new Subject();
        subject.registerObserver(concreteObserverA);
        subject.registerObserver(concreteObserverB);

        subject.notifyObservers("test message");


    }
}
