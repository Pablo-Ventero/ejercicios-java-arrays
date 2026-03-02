package Ejercicio015;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que lea 10 n�meros por teclado y que luego 
los muestre en orden  inverso, es decir, 
el primero que se introduce es el �ltimo en mostrarse y viceversa.
*/

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce 10 n�meros: ");
        
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int veces = 1; veces < 10; veces++) {
            int num = teclado.nextInt();
            numeros.add(num);
        }
        System.out.println(numeros);
        for (int i = numeros.size()-1; i >= 0; i--) {
            System.out.print(numeros.get(i)+", ");
        }
    }
}
