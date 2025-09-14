/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Keiver
 */
public class Client {

    public void SystemPayment(double amount, String type) {
        System.out.println("Iniciando proceso de pago por $" + amount + " con el método de pago: " + type);

        IPayment paymentSystem;

        switch (type) {
            case "CreditCard":
                paymentSystem = new PaymentAdapter("CreditCard");
                break;
            case "PayPal":
                paymentSystem = new PaymentAdapter("PayPal");
                break;
            case "Crypto":
                paymentSystem = new PaymentAdapter("Crypto");
                break;
            default:
                System.out.println("Método de pago no soportado.");
                return;
        }

        if (paymentSystem.pay(amount)) {
            System.out.println("Querido cliente, su pago con " + type + " fue exitoso.");
        } else {
            System.out.println("Querido cliente, su pago con " + type + " no pudo ser completado.");
        }
    }
}
