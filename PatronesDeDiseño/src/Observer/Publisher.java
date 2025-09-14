/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Keiver
 */
public class Publisher {

    private List<Suscriber> suscribers;

    public Publisher() {
        this.suscribers = new ArrayList<>();
    }

    public void subscribe(Suscriber suscriber) {
        suscribers.add(suscriber);
        System.out.println("Suscriptor agregado correctamente: Total de suscriptores = " + suscribers.size());
    }

    public void unsubscribe(Suscriber suscriber) {
        if (suscribers.remove(suscriber)) {
            System.out.println("Suscriptor eliminado correctamente: Total suscriptores restantes = " + suscribers.size());
        } else {
            System.out.println("Suscriptor no encontrado.");
        }
    }

    public void notifySubscribers(String context) {
        System.out.println("Notificando a " + suscribers.size() + " suscriptores sobre: " + context);
        for (Suscriber suscriber : suscribers) {
            suscriber.update(context);
        }
    }

    public void createAlert(String alertMessage) {
        System.out.println("Creando alerta - " + alertMessage);
        notifySubscribers("ULTIMA HORA: " + alertMessage);
    }
}
