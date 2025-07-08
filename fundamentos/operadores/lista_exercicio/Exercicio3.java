package lista_exercicio;

import java.util.Scanner;

public class Exercicio3 {
    /*
     * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double peso, altura;

        System.out.print("Digite seu peso (kg): ");
        peso = sc.nextDouble();

        System.out.print("Digite sua altura (m): ");
        altura = sc.nextDouble();

        // Cálculo do IMC
        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f%n", imc);

        sc.close();
    }
}
