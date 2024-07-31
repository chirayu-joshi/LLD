public class PayToMerchantFlow extends PaymentFlow {
    @Override
    public void validateRequest() {
        System.out.println("Validate logic of PayToMerchantFlow");
    }

    @Override
    public void calculateFees() {
        System.out.println("2% fees charged of PayToMerchantFlow");
    }

    @Override
    public void debitAmount() {
        System.out.println("Logic for Debit the amount of PayToMerchantFlow");
    }

    @Override
    public void creditAmount() {
        System.out.println("Logic for Credit amount of PayToMerchantFlow");
    }
}
