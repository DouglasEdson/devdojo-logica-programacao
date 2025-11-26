public class ViradoNoJiraya {
    // Atributos da classe
    String nome;
    int idade;

    // Construtor
    public ViradoNoJiraya(String nome, int idade) {
        this.nome = nome; //"this" se refere ao atributo da classe
        this.idade = idade;
    }

    // Método main
    public static void main(String[] args) {
        // Criando um objeto usando o construtor
        ViradoNoJiraya pessoa = new ViradoNoJiraya("Douglas", 36);
   System.out.println("Nome: " + pessoa.nome);
   System.out.print("Idade: " + pessoa.idade);
    }
}

