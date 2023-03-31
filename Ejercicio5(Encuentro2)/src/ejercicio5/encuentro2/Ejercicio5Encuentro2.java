/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5.encuentro2;

import java.util.Scanner;

/**
 *
 * @author ferna
 */
public class Ejercicio5Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*Escribir un programa que lea un número entero por teclado y 
        muestre por pantalla el doble, el triple y la raíz cuadrada de ese número.*/
        
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        int num = leer.nextInt();
        
        System.out.println("El doble del numero es: " + num * 2);
        System.out.println("El triple del numero es: " + num * 3);
        System.out.println("La raiz cuadrada del numero es: " + Math.sqrt(num));
        
                

    }
    
}
