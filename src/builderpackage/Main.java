/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpackage;

/**
 *
 * @author apinodominguez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee informatico; 
        informatico = new EmployeeBuilder("Manuel", 1234)
                                    .setNewLastName("Fernandez")
                                    .createEmployee();
        System.out.println(informatico.toString());
        Employee administrador;
        administrador = new EmployeeBuilder("Juan", 1236)
                                    .setNewLastName("Pino")
                                    .setNewHireYear(1993)
                                    .createEmployee();
        System.out.println(administrador.toString());
                                    
    }       
    
}
