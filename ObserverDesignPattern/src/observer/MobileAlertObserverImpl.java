package observer;

import observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private final String userMobileId;
    private final StocksObservable observable;

    public MobileAlertObserverImpl(String userMobileId, StocksObservable observable) {
        this.userMobileId = userMobileId;
        this.observable = observable;
    }

    @Override
    public void update() {
        int productNewStockCount = observable.getStockCount();
        sendPushNotification(this.userMobileId, productNewStockCount + " products are in stock. Hurry up!");
    }

    private void sendPushNotification(String userMobileId, String message) {
        System.out.println("Push Notification sent to: " + userMobileId + ". Message: " + message);
    }
}
