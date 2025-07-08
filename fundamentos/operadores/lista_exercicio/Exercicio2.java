package lista_exercicio;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String[] args){
        /*
         * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
         */
            Scanner sc = new Scanner(System.in);
            double temperaturaCelsius;

            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaCelsius = sc.nextDouble();

            // Cálculo da temperatura
            double conversaoFahrenheit = (temperaturaCelsius * 1.8) + 32;

            System.out.printf("Temperatura em Celsius: %.2f °C%n", temperaturaCelsius);
            System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", conversaoFahrenheit);

            sc.close();
        }

}
