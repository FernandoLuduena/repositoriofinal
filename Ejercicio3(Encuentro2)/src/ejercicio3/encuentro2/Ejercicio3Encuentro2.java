/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3.encuentro2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Ejercicio3Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase ");
        String frase = leer.nextLine();
        System.out.println("Esta es su frase en mayusculas: " + frase.toUpperCase());
        System.out.println("Esta es su frase en minusculas: " + frase.toLowerCase());
    }
    
}
