public class ExemploVariaveis {
    // Variável de instância
    String nome = "Douglas Edson";

    // Variável estática
    static String linguagem = "Java";

    public void mostrar() {
        // Variável local
        int idade = 36;
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Linguagem: " + linguagem);
    }

    public static void main(String[] args) {
        ExemploVariaveis exemplo = new ExemploVariaveis();
        exemplo.mostrar();
    }


}
