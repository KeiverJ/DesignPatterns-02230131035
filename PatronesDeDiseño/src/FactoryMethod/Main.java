/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Keiver
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Implementación del Patron de Diseño: Factory Method. \n");

        Creator CreatorPDF = new CreatorReportPDF();
        Creator CreatorHTML = new CreatorReportHTML();
        Creator CreatorExcel = new CreatorReportExcel();

        System.out.println("1. Procesando Reporte de notas en PDF:");
        CreatorPDF.processReport();

        System.out.println("\n2. Procesando Reporte de notas en HTML:");
        CreatorHTML.processReport();

        System.out.println("\n3. Procesando Reporte de notas Excel:");
        CreatorExcel.processReport();

        System.out.println("\nExportación completada con exito.");
    }
}
