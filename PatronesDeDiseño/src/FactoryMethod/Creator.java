/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FactoryMethod;

/**
 *
 * @author keive
 */
abstract class Creator {

    public abstract IReport createReport();

    public void processReport() {
        IReport reporte = createReport();
        reporte.generateReport();
        reporte.exportReport();
    }

}
