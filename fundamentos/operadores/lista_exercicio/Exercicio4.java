package lista_exercicio;

import java.util.Scanner;

public class Exercicio4 {
    /*
     * Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valor;

        System.out.print("Digite um valor: ");
        valor = sc.nextDouble();

        double aoQuadrado = Math.pow(valor, 2);
        double aoCubo = Math.pow(valor, 3);

        System.out.printf("Valor ao quadrado: %.2f%n", aoQuadrado);
        System.out.printf("Valor ao cubo: %.2f%n", aoCubo);

        sc.close();
    }
}
