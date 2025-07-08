package lista_exercicio;

import java.util.Scanner;

public class Exercicio5 {
    /*
     * Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base, altura;

        System.out.print("Digite o valor da base do triângulo: ");
        base = sc.nextDouble();

        System.out.print("Digite o valor da altura do triângulo: ");
        altura = sc.nextDouble();

        double area = (base * altura) / 2;

        System.out.printf("A área do triângulo é: %.2f%n", area);

        sc.close();
    }
}
