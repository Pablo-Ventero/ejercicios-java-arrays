package Ejercicio010;

import java.util.Arrays;

/*
Hacer un programa que rellene un array con los 100 primeros n�meros enteros 
y los muestre en pantalla en orden inverso a como se han introducido (orden inverso).
*/

public class Principal {
    public static void main(String[] args) {
        int[] vectorNumeros = new int [10];
        for (int i = 0; i < vectorNumeros.length; i++) {
           vectorNumeros[i]=(int) (Math.random() * 101);
       }
        System.out.println(Arrays.toString(vectorNumeros));
        for (int i = vectorNumeros.length-1; i >=0; i--) {
            if (i==0) {
                System.out.println(vectorNumeros[i]+"]");
            } else {
                System.out.println(vectorNumeros[i]+",");
            }
        }
    } 
}
