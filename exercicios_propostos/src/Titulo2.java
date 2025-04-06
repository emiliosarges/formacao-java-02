import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Titulo2 {

    public static void main(String[] args) {
        // Criando objetos da classe Titulo
        Titulo titulo1 = new Titulo("O Senhor dos Anéis");
        Titulo titulo2 = new Titulo("A Sociedade do Anel");
        Titulo titulo3 = new Titulo("O Retorno do Rei");
        Titulo titulo4 = new Titulo("As Duas Torres");

        // Adicionando os objetos a uma lista
        List<Titulo> listaTitulos = new ArrayList<>();
        listaTitulos.add(titulo1);
        listaTitulos.add(titulo2);
        listaTitulos.add(titulo3);
        listaTitulos.add(titulo4);

        // Ordenando a lista
        Collections.sort(listaTitulos);

        // Imprimindo os títulos ordenados
        System.out.println("Títulos ordenados:");
        for (Titulo titulo : listaTitulos) {
            System.out.println(titulo.getNome());
        }
    }
}
