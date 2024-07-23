package observable;

import observer.NotificationAlertObserver;

public interface StocksObservable {
    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setStockCount(int newStockCount);

    int getStockCount();
}
