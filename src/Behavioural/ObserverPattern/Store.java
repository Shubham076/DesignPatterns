package Behavioural.ObserverPattern;

import Behavioural.ObserverPattern.Observable.IPhoneStockObservable;
import Behavioural.ObserverPattern.Observer.EmailObserver;
import Behavioural.ObserverPattern.Observer.NotificationObserver;
import Behavioural.ObserverPattern.Observer.SmsObserver;

public class Store {

    public static void main(String[] args) {
        IPhoneStockObservable iphoneObservable = new IPhoneStockObservable();
        NotificationObserver obs1 = new EmailObserver("abc@gmail.com", iphoneObservable);
        NotificationObserver obs2 = new SmsObserver("1234567891", iphoneObservable);

        iphoneObservable.add(obs1);
        iphoneObservable.add(obs2);
        iphoneObservable.setCount(10);
    }
}
