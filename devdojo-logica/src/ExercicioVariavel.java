public class ExercicioVariavel {
    public static void main(String[] args) {
        double salario = 5500.00;

        double salarioComCinco = (salario * 0.05) + salario;
        double salarioComQuinze = (salario * 0.15) + salario;
        double salarioComTrinta = (salario * 0.30) + salario;


        System.out.println("O salário fixo é: " + salario);
        System.out.println("Com aumento de 5%. O novo salário vai para: " + salarioComCinco);
        System.out.println("Com aumento de 15%. O novo salário vai para: " + salarioComQuinze );
        System.out.println("Com aumento de 30%. O novo salário vai para: " + salarioComTrinta);

    }
}
