/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1.encuentro2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Ejercicio1Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();
        int num2;
        System.out.println("Ingrese el segundo numero: ");
        num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros ingresados es: " + suma);
        
    }
    
}
