import java.util.Scanner;

public class CalcularSalario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do salário bruto: ");
        double salarioBruto = scanner.nextDouble();

        // Exemplo de cálculo simplificado de INSS (11%)
        double descontoINSS = salarioBruto * 0.11;
        // Exemplo de cálculo simplificado de IR (15%)
        double descontoIR = salarioBruto * 0.15;

        double salarioLiquido = salarioBruto - descontoINSS - descontoIR;

        System.out.println("\n====== Demonstrativo =====");
        System.out.printf("Salário bruto: %.2f%n", salarioBruto);
        System.out.printf("Desconto INSS: %.2f%n", descontoINSS);
        System.out.printf("Desconto IR: %.2f%n", descontoIR);
        System.out.printf("Salário líquido: %.2f%n", salarioLiquido);

        scanner.close();
    }
}
