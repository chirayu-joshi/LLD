public class Main {
    public static void main(String[] args) {
        PaymentFlow friendFlow = new PayToFriendFlow();
        friendFlow.sendMoney();

        PaymentFlow merchantFlow = new PayToMerchantFlow();
        merchantFlow.sendMoney();
    }
}
