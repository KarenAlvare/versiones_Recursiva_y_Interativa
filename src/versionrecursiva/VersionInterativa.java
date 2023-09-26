package versionrecursiva;

import java.util.Scanner;

public class VersionInterativa{

     
    public static int encontrarMCDIterativo(int segundoNumero, int primerNumero) {
        while (primerNumero != 0) {
            int temp = primerNumero;
            primerNumero = segundoNumero % primerNumero;
            segundoNumero = temp;
        }
        return segundoNumero;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ºººººººººººººººººººººººººººººº");
        System.out.print("Ingresa el primer número: ");
        int numero1 = scanner.nextInt();
        
        System.out.println("ºººººººººººººººººººººººººººººº");
        System.out.print("Ingresa el segundo número: ");
        int numero2 = scanner.nextInt();

        int mcdIterativo = encontrarMCDIterativo(numero1, numero2);
        System.out.println("El MCD de " + numero1 + " y " + numero2 + " es: " + mcdIterativo);
    }
}