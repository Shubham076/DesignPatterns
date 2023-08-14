package Behavioural.ObserverPattern.Observable;

import Behavioural.ObserverPattern.Observer.NotificationObserver;

public interface StockObservable {
    public void add(NotificationObserver obj);
    public void remove(NotificationObserver obj);
    public void notifyObservers();
    public void setCount(int val);
    public int getCount();
}
