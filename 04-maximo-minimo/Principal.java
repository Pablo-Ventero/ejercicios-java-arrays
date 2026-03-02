package Ejercicio017;

import java.util.ArrayList;

/*
Escribe un programa que genere aleatoriamente un array de 15 componentes 
y muestre los valores m�ximo y m�nimo junto con las 
palabras �m�ximo� y �m�nimo� al lado respectivamente.
*/

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int veces = 1; veces < 15; veces++) {
            numeros.add((int) (Math.random() * 101));    
    }
        System.out.println(numeros);
        
        int max = numeros.get(0);
        int min = numeros.get(0);
        for (Integer n : numeros) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        System.out.println("MIN: "+min+", MAX: "+max);       
        }
}
