import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaFlexivel {

    public static void main(String[] args) {
        // Usando ArrayList
        List<String> listaArray = new ArrayList<>();
        listaArray.add("Maçã");
        listaArray.add("Banana");
        listaArray.add("Laranja");

        System.out.println("Elementos da ArrayList:");
        for (String fruta : listaArray) {
            System.out.println(fruta);
        }

        // Usando LinkedList
        List<String> listaLinked = new LinkedList<>();
        listaLinked.add("Carro");
        listaLinked.add("Moto");
        listaLinked.add("Bicicleta");

        System.out.println("\nElementos da LinkedList:");
        for (String veiculo : listaLinked) {
            System.out.println(veiculo);
        }
    }
}
