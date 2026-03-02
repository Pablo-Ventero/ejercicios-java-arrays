package Ejercicio016;

import java.util.ArrayList;

/*
Define tres arrays de 20 n�meros enteros cada una, con nombres n�mero, cuadrado y cubo. 
Carga el array numero con valores aleatorios entre 0 y 100. 
En el array cuadrado se deben almacenar los cuadrados de los valores que hay en el array n�mero. 
En el array cubo se deben almacenar los cubos de los valores que hay en n�mero. 
A continuaci�n, muestra el contenido de los tres arrays dispuesto en tres columnas.
*/

public class Principal {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        for (int veces = 1; veces < 10; veces++) {
            numeros.add((int) (Math.random() * 101));
        }
        System.out.println(numeros);
        ArrayList<Integer> cuadrados = new ArrayList<>();
        ArrayList<Integer> cubos = new ArrayList<>();
        for (int i = 0; i < numeros.size(); i++) {
            cuadrados.add((int)Math.pow(numeros.get(i), 2));
            cubos.add((int)Math.pow(numeros.get(i), 3));
        }
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i)+ "\t" + cuadrados.get(i)+ "\t" + cubos.get(i));
        }
    }    
}
