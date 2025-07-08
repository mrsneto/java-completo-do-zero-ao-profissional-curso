package lista_exercicio;

import java.util.Scanner;

public class Exercicio1 {
    /*
     * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double temperaturaFahrenheit;

        System.out.print("Digite a temperatura em Fahrenheit: ");
        temperaturaFahrenheit = sc.nextDouble();

        // Cálculo da temperatura
        double conversaoCelsius = (temperaturaFahrenheit - 32) / 1.8;

        System.out.printf("Temperatura em Fahrenheit: %.2f °F%n", temperaturaFahrenheit);
        System.out.printf("Temperatura em Celsius: %.2f °C%n", conversaoCelsius);

        sc.close();
    }
}
