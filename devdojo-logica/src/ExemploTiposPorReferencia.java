import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.time.LocalDate;

public class ExemploTiposPorReferencia {
    public static void main(String[] args) {
        // String
        String nome = "Douglas";

        //Array
        int[] numeros = {1, 2, 3};

        //ArrayList
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Java");
        lista.add("C++");

        //HashMap
        HashMap<String, Integer> mapa = new HashMap<>();
        mapa.put("Idade" , 30);
        mapa.put("Ano" , 2025);

        //LocalDate
        LocalDate hoje = LocalDate.now();

        // Scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Nome: " + nome);
        System.out.println("Primeiro número: " + numeros[2]);
        System.out.println("Lista: " + lista);
        System.out.println("Mapa: " + mapa);
        System.out.println("Data de hoje: " + hoje);

        entrada.close();
    }
}
