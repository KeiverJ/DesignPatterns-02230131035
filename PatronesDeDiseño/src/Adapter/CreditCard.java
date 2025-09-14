/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Adapter;

/**
 *
 * @author Keiver
 */
public class CreditCard {

    private String cardNumber;
    private String name;
    private short cvv;
    private String Date;

    public CreditCard() {
        this.cardNumber = "3697431623237";
        this.name = "Keiver Castellanos";
        this.cvv = 210;
        this.Date = "10/25";
    }

    public boolean makePay(double amount) {
        System.out.println("Procesando pago de $" + amount);
        System.out.println("Número de tarjeta terminada en "
                + String.valueOf(cardNumber).substring(5)
                + ", titular: " + name
                + ", vence: " + Date);
        System.out.println("Pago realizado con exito.");
        return true;

    }
}
