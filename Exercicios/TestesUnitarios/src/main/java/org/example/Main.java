package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Imprimir imprime = new Imprimir();

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String resultado;

        System.out.print("Digite o número maior que 1: ");
        double num = scanner.nextDouble();

        for (int i = 1; i <= num; i++) {
            resultado = imprime.imprimir(i);
            if (resultado.equals("")) {
                System.out.println(i);
            } else if (resultado.equals("Fizz")) {
                System.out.println(resultado);
            } else if (resultado.equals("Buzz")) {
                System.out.println(resultado);
            } else
                System.out.println(resultado);
        }


    }
}
