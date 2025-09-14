package Observer;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author keiver
 */
public class Paypal {

    private String userName;
    private String email;
    private String password;

    public Paypal() {
        this.userName = "KeiverJ";
        this.email = "keiver@gmail.com";
        this.password = "12234";
    }

    public boolean sendPay(double amount) {
        System.out.println("Enviando pago de $" + amount);
        System.out.println("Usuario: " + userName
                + ", al email: " + email);
        System.out.println("Pago en PayPal realizado correctamente");
        return true;
    }
}
