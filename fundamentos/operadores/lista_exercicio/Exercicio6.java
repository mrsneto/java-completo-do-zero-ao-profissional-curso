package lista_exercicio;

public class Exercicio6 {
    /*
     * Criar um programa que resolve equações do segundo grau (ax² + bx + c = 0)
     * utilizando a fórmula de Bhaskara.
     * Exemplo: a = 1, b = 12, c = -13
     */
    public static void main(String[] args) {
        // Coeficientes da equação
        double a = 1;
        double b = 12;
        double c = -13;

        // Calculando o delta
        double delta = Math.pow(b, 2) - 4 * a * c;

        System.out.println("Delta: " + delta);

        if (delta < 0) {
            System.out.println("A equação não possui raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.printf("As raízes da equação são:%n");
            System.out.printf("x1 = %.2f%n", x1);
            System.out.printf("x2 = %.2f%n", x2);
        }
    }
}
