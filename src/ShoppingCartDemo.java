public class ShoppingCartDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Item1", 25.0, 2));
        cart.addProduct(new Product("Item2", 10.0, 3));

        PaymentStrategy creditCardPayment = new CreditCardPaymentStrategy("1234-5678-9012-3456");
        PaymentStrategy paypalPayment = new PayPalPaymentStrategy("example@email.com");

        cart.setPaymentStrategy(creditCardPayment);
        cart.checkout();

        cart.setPaymentStrategy(paypalPayment);
        cart.checkout();
    }
}
