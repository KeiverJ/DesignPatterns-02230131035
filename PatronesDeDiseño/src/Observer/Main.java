/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Keiver
 */
public class Main {

    public static void main(String[] args) {
        Publisher newsPublisher = new Publisher();

        Client cliente1 = new Client("Andrés Toscano", 10);
        Client cliente2 = new Client("Sara Barboza", 12);
        Client cliente3 = new Client("Luis Diaz", 02);

        ConcreteSuscribers suscriptor1 = new ConcreteSuscribers(cliente1.getName(), "andres@email.com", "Tecnologia");
        ConcreteSuscribers suscriptor2 = new ConcreteSuscribers(cliente2.getName(), "perlitag@email.com", "Deportes");
        ConcreteSuscribers suscriptor3 = new ConcreteSuscribers(cliente3.getName(), "lucho@email.com", "Ofertas");

        newsPublisher.subscribe(suscriptor1);
        newsPublisher.subscribe(suscriptor2);
        newsPublisher.subscribe(suscriptor3);

        newsPublisher.notifySubscribers("Nueva actualización disponible para el sistema.");
        newsPublisher.createAlert("Mantenimiento programado de 2:00 AM a 5:00 AM");

        newsPublisher.unsubscribe(suscriptor3);
        newsPublisher.notifySubscribers("Servicios nuevamente funcionales.");
    }
}
