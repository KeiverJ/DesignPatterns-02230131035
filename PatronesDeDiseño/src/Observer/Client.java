/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Keiver
 */
public class Client {

    private int idClient;
    private String name;

    public Client(String name, int idClient) {
        this.idClient = idClient;
        this.name = name;
    }

    public int getIdClient() {
        return idClient;
    }

    public String getName() {
        return name;
    }

}
