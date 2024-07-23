package observer;

import observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {
    private final String emailId;
    private final StocksObservable observable;

    public EmailAlertObserverImpl(String emailId, StocksObservable observable) {
        this.emailId = emailId;
        this.observable = observable;
    }

    @Override
    public void update() {
        int productNewStockCount = observable.getStockCount();
        sendEmail(this.emailId, productNewStockCount + " products are in stock. Hurry up!");
    }

    private void sendEmail(String emailId, String message) {
        // Send actual email
        System.out.println("Email sent to: " + emailId + ". Email message: " + message);
    }
}
