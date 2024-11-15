package CodeAlpha;

public class Payment {
    public static boolean processPayment(double totalPrice, double paymentAmount) {
        if (paymentAmount >= totalPrice) {
            System.out.println("Payment Successful! Amount Paid: $" + paymentAmount);
            return true;
        } else {
            System.out.println("Insufficient funds. Payment failed.");
            return false;
        }
    }
}
