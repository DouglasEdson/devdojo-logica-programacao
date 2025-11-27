public class ExercicioVariavel {
    public static void main(String[] args) {
        double salario = 5500.00;

        double aumentoCinco = salario * (5.0 / 100);
        double aumentoQuinze = salario * (15.0 / 100);
        double aumentoTrinta = salario * (30.0 / 100);

        double salarioComCinco = salario + aumentoCinco;
        double salarioComQuinze = salario + aumentoQuinze;
        double salarioComTrinta = salario + aumentoTrinta;

        double somaSalarioCinco = salario + aumentoCinco;
        double somaSalarioQuinze = salario + aumentoQuinze;
        double somaSalarioTrinta = salario + aumentoTrinta;

        System.out.println("O salário fixo é: " + salario);
        System.out.println("Com aumento de 5%: " + aumentoCinco + " O novo salário vai para: " + somaSalarioCinco);
        System.out.println("Com aumento de 15%: " + aumentoQuinze + " O novo salário vai para: " + somaSalarioQuinze);
        System.out.println("Com aumento de 30%: " + aumentoTrinta +  " O novo salário vai para: " + somaSalarioTrinta);

    }
}
