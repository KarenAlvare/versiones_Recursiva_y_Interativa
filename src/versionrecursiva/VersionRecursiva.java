package versionrecursiva;

import java.util.Scanner;

public class VersionRecursiva {

    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ºººººººººººººººººººººººººººººººº");
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("ºººººººººººººººººººººººººººººººº");
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

      
        int resultado = mcd(numero1, numero2);

        
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + resultado);
    }
}