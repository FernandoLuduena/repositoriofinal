/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4.encuentro2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Ejercicio4Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados Fahrenheit.
        La fórmula correspondiente es: F = 32 + (9 * C / 5).*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centigrados: ");
        float tempC = leer.nextFloat();
        
        float tempF = 32 + (9 * tempC / 5);
        
        System.out.println("Su temperatura en Farenheit es : " + tempF + " °F");
        
        
        

    }
    
}
