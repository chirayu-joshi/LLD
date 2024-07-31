public class PayToFriendFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToFriendFlow");
    }

    @Override
    public void calculateFees() {
        System.out.println("0% fees charged of PayToFriendFlow");
    }

    @Override
    public void debitAmount() {
        System.out.println("Logic for Debit the amount of PayToFriendFlow");
    }

    @Override
    public void creditAmount() {
        System.out.println("Logic for Credit amount of PayToFriendFlow");
    }
}
