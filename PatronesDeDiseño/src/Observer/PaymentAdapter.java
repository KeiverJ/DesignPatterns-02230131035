/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Keiver
 */
public class PaymentAdapter implements IPayment {

    private String paymentMethod;
    private CreditCard creditCard;
    private Paypal paypal;
    private Crypto crypto;

    public PaymentAdapter(String paymentMethod) {
        this.paymentMethod = paymentMethod;

        switch (paymentMethod) {
            case "CreditCard":
                this.creditCard = new CreditCard();
                break;
            case "PayPal":
                this.paypal = new Paypal();
                break;
            case "Crypto":
                this.crypto = new Crypto();
                break;
        }
    }

    @Override
    public boolean pay(double amount) {
        System.out.println("Se va a realizar el método de pago con: " + paymentMethod);

        switch (paymentMethod) {
            case "CreditCard":
                return creditCard.makePay(amount);
            case "PayPal":
                return paypal.sendPay(amount);
            case "Crypto":
                return crypto.transfer(amount);
            default:
                System.out.println("Servicio no soportado");
                return false;
        }
    }
}
