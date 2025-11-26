import java.util.Scanner;

public class CalculadoraDiferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira idade: " );
        int idade1 = scanner.nextInt();
        System.out.println("Digite a segunda idade: ");
        int idade2 = scanner.nextInt();

        int diferencaIdade = idade1 - idade2;

        System.out.println("A diferença de idade é: " + diferencaIdade);
    }
}
