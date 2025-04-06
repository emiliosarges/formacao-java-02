import java.util.List;
import java.util.ArrayList;
// Se quiser testar com LinkedList, basta importar:
// import java.util.LinkedList;

public class ListaPolimorfica {

    public static void main(String[] args) {
        // Declarando a variável como List (interface)
        List<String> frutas = new ArrayList<>();
        // Para trocar a implementação, basta mudar para:
        // List<String> frutas = new LinkedList<>();

        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");

        System.out.println("Lista de frutas:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }
    }
}
