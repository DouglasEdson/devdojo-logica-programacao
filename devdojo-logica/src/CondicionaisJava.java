import java.util.Scanner;

public class CondicionaisJava {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;
        do {

            System.out.println("=====Menu Principal=====");
            System.out.println("1 - Verificar nota");
            System.out.println("2 - Verificar idade");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");
            opcao = entrada.nextInt();

            // Switch para Menu
            switch (opcao) {
                case 1:
                    System.out.println("\n--- Verificação de nota ---");
                    System.out.println("Digite a nota (0 a 100): ");
                    int nota = entrada.nextInt();

                    // if.. else if.. else - para avaliar a nota
                    if (nota >= 90) {
                        System.out.println("Aprovado, parabéns!");
                    } else if (nota >= 70) {
                        System.out.println("Aprovado, bom!");
                    } else if (nota >= 50) {
                        System.out.println("Aprovado.");
                    } else {
                        System.out.println("Reprovado!");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Verificação de Idade ---");
                    System.out.println("Digite a sua idade: ");
                    int idade = entrada.nextInt();

                    // if.. else para verificar maioridade
                    if (idade >= 18) {
                        System.out.println("Você é maior de idade.");
                    } else {
                        System.out.println("Você é menor de idade.");
                    }

                    // Operador ternário para resumo rápido
                    String resultado = (idade >= 18) ? "Adulto" : "Menor";
                    System.out.println("Classificação: " + resultado);
                    break;

                case 3:
                    System.out.println("\nEncerrando o sistema... Até logo!");
                    break;

                default:
                    System.out.println("\n Opção inválida! Tente novamente!");
            }
            if (opcao != 3) {
                System.out.println("\nPressione ENTER para voltar ao menu...");
                entrada.nextLine(); // Consome o ENTER
                entrada.nextLine(); // Espera o usuário apertar ENTER
            }

        } while (opcao != 3);
        entrada.close();
    }
}

