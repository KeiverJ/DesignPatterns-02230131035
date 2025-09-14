/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Keiver
 */
public class Crypto {

    private String walletAddress;
    private String Key;
    private String cryptoType;

    public Crypto() {
        this.walletAddress = "KJhba97sdyAiajsgd62SYDG";
        this.Key = "xmdfb87se5t3479ht97842y5oiwenf";
        this.cryptoType = "Ethereum";
    }

    public boolean transfer(double amount) {
        System.out.println("Realizando transferencia de " + amount + " " + cryptoType);
        System.out.println("Wallet origen: " + walletAddress + "."
                + ", con el tipo de crypto: " + cryptoType);

        System.out.println("La transferencia se realizó correctamente");
        return true;
    }
}
