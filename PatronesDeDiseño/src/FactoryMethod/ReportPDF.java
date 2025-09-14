/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author keive
 */
public class ReportPDF implements IReport {

    private String title;
    private String pageSize;

    public ReportPDF() {
        this.title = "Reporte notas en PDF";
        this.pageSize = "A4";
    }

    @Override
    public void exportReport() {
        System.out.println("Reporte PDF: Exportando archivo con título='" + title
                + "', tamaño de página=" + pageSize);
    }

    @Override
    public void generateReport() {
        System.out.println("Reporte PDF: Generando contenido del reporte PDF...");
    }
}
