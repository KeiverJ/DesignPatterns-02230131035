/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author Keiver
 */
public class CreatorReportHTML extends Creator {

    @Override
    public IReport createReport() {
        System.out.println("HTMLReportCreator: Creando reporte de notas en formato HTML.");
        return new ReportHTML();
    }
}
