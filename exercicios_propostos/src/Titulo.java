import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo implements Comparable<Titulo> {
    private String nome;

    // Construtor
    public Titulo(String nome) {
        this.nome = nome;
    }

    // Getter
    public String getNome() {
        return nome;
    }

    // Implementação do método compareTo para ordenação alfabética
    @Override
    public int compareTo(Titulo outro) {
        return this.nome.compareTo(outro.getNome());
    }

    // Sobrescrevendo toString para facilitar a impressão
    @Override
    public String toString() {
        return nome;
    }

    // Classe principal para testar
    public static void main(String[] args) {
        List<Titulo> titulos = new ArrayList<>();
        titulos.add(new Titulo("Senhor dos Anéis"));
        titulos.add(new Titulo("O Hobbit"));
        titulos.add(new Titulo("As Crônicas de Nárnia"));
        titulos.add(new Titulo("Duna"));

        // Ordenando a lista de títulos
        Collections.sort(titulos);

        // Imprimindo a lista ordenada
        System.out.println("Títulos ordenados:");
        for (Titulo titulo : titulos) {
            System.out.println(titulo);
        }
    }
}
