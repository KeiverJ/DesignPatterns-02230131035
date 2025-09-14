/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

/**
 *
 * @author Keiver
 */
public class ConcreteSuscribers implements Suscriber {

    private String name;
    private String email;
    private String suscriptions;

    public ConcreteSuscribers(String name, String email, String suscriptions) {
        this.name = name;
        this.email = email;
        this.suscriptions = suscriptions;
    }

    @Override
    public void update(String context) {
        System.out.println("El siguiente suscriptor " + name + " (" + email + "): Recibió actualización sobre "
                + suscriptions + " - Contenido: " + context);

        switch (suscriptions.toLowerCase()) {
            case "Tecnologia":
                System.out.println("  * " + name + ": Procesando como noticia tecnologica");
                break;
            case "Deportes":
                System.out.println("  * " + name + ": Procesando como noticia deportiva");
                break;
            case "Ofertas":
                System.out.println("  * " + name + ": Procesar como ofertas disponibles");
                break;
            default:
                System.out.println("  * " + name + ": Procesando como actualización general");
                break;
        }
    }
}
