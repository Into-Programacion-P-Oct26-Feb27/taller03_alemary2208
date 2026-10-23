/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio05;

/**
 *
 * @author Usuario
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int variable1 = 3;
        int variable2 = 81;
        int variable3 = 40;
        
        System.out.println("------solución de problema------------");
        boolean resultado = (Math.pow (variable1,3)) + Math.sqrt(variable2) 
                <= variable3;
        
        System.out.println(resultado);
    }
    
}
