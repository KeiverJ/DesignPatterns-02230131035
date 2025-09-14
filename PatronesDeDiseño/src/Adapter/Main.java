/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Keiver
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Implementación del patron de diseño Adapter \n");

        Client cliente = new Client();

        System.out.println("PRUEBA 1: Pago con tarjeta de crédito");
        cliente.SystemPayment(67, "CreditCard");

        System.out.println("\nPRUEBA 2: Pago con PayPal");
        cliente.SystemPayment(652.87, "PayPal");

        System.out.println("\nPRUEBA 3: Pago con Crypto");
        cliente.SystemPayment(100000.00, "Crypto");

        System.out.println("\nPRUEBA 4: Método de pago no soportado ");
        cliente.SystemPayment(50.00, "ApplePay");
    }
}
