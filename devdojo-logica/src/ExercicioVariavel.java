import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class ExercicioVariavel {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // Criando o objeto Decimalformat
        NumberFormat nf = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));

        System.out.println("Digite o valor do salário: ");
        double salario = entrada.nextDouble();
        System.out.println("Digite o valor da porcentagem: ");
        double porcentagem = entrada.nextDouble();

        double valorPorcentagem = salario * (porcentagem / 100);
        double salarioAumento = salario + valorPorcentagem;
        double salarioDesconto = salario - valorPorcentagem;


        System.out.println("\nO salário fixo é: " + nf.format(salario));
        System.out.println("Valor da porcentagem: " + nf.format(valorPorcentagem));
        System.out.println("Salário com aumento de " + porcentagem + "%:  " + nf.format(salarioAumento));
        System.out.println("Salário com desconto de " + porcentagem + "%: " + nf.format(salarioDesconto));

        entrada.close();

    }
}
