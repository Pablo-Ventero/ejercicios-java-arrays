package Ejercicio019;

import java.util.ArrayList;
import java.util.Scanner;

/*
Escribe un programa que genere 100 n�meros aleatorios del 0 al 20 
y que los muestre por pantalla separados por espacios. 
El programa pedir� entonces por teclado dos valores y a continuaci�n 
cambiar� todas las ocurrencias del primer valor por el segundo en la 
lista generada anteriormente. Los n�meros que se han cambiado deben aparecer entrecomillados.
*/

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numerosA = new ArrayList<>();
        for (int veces = 1; veces < 100; veces++) {
            numerosA.add((int) (Math.random() * 21));    
    }
        System.out.println(numerosA);
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros: ");
        int original = teclado.nextInt();
        int cambio = teclado.nextInt();
        for (int i = 0; i < numerosA.size(); i++) {
            if (numerosA.get(i)==original) {
                numerosA.set(i, cambio);
                System.out.print("["+cambio+"], ");
            }else{
                System.out.print(numerosA.get(i)+", ");
            }            
        }
    }
}
