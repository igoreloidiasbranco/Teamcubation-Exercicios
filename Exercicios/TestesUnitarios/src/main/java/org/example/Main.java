package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String resultado;

        System.out.print("Digite o número maior que 1: ");
        double num = scanner.nextDouble();

        for (int i = 1; i <= num; i++) {
            resultado = imprimir(i);
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

    static public String imprimir(double num) {
        if (num % 3 == 0 && num % 5 == 0) {
            return "FizzBuzz";
        } else if (num % 3 == 0) {
            return "Fizz";
        } else if (num % 5 == 0) {
            return "Buzz";
        } else {
            return "";
        }
    }
}
