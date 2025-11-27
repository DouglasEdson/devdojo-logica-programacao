public class CondicionaisAula1 {
    public static void main(String[] args) {
        int idade = 36;
        if (idade >= 18) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        int nota = 74;
        if (nota >= 90) {
            System.out.println("Aprovado, parabéns!");
        } else if (nota >= 75) {
            System.out.println("Aprovado.");
        } else {
            System.out.println("Reprovado");
        }
        int dia = 10;
        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Dia inválido.");
        }
        int idade2 = 15;
        String resultado = (idade2 >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(resultado);
    }
}