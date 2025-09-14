/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Keiver
 */
public class ReportExcel implements IReport {

    private String title;
    private int numberSheets;
    private String dataRange;

    public ReportExcel() {
        this.title = "Reporte de notas en Excel";
        this.numberSheets = 2;
        this.dataRange = "A10:T10";
    }

    @Override
    public void exportReport() {
        System.out.println("Reporte de notas en Excel: " + title + " con " + numberSheets
                + " hojas y un rango de datos de " + dataRange);
    }

    @Override
    public void generateReport() {
        System.out.println("Reporte de notas en Excel: Generando contenido de la notas en un reporte de " + numberSheets + " hojas");
    }
}
