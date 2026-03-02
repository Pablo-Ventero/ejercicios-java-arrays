package HexadecimalDecimal;

import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Scanner lector = new Scanner(System.in);
        
        int[] hexa = new int[4];
        int decimal = 0;
        int potencia = 1;
        
        System.out.println("4 valores en hexadecimal");
        for (int i = 0; i < 4; i++) {
            System.out.println("Posicion "+ (i + 1)+": ");
            hexa[i] = lector.nextInt();
        }
        for (int i = 3; i >= 0; i--) {
            decimal = decimal + (hexa[i] * potencia);
            potencia = potencia * 16;
        }
        System.out.println("El numero decimal es: "+decimal);
    }
}
