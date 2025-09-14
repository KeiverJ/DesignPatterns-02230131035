/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Keiver
 */
public class ReportHTML implements IReport {

    private String title;
    private String cssStyles;
    private String structureHTML;

    public ReportHTML() {
        this.title = "Reporte de notas en HTML";
        this.cssStyles = "./css/styles.css";
        this.structureHTML = "<html><head><title>" + title + "</title></head><body>'Notas del Semestre:'</body></html>";
    }

    @Override
    public void exportReport() {
        System.out.println("Reporte de notas en HTML: " + title
                + "', con los estilos CSS=" + cssStyles);
    }

    @Override
    public void generateReport() {
        System.out.println("Reporte de notas HTML: Generando contenido con la estructura HTMML: " + structureHTML);
    }
}
