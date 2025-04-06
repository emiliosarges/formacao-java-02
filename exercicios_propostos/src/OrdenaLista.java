import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenaLista {
    public static void main(String[] args) {
        // Criando a lista de números inteiros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(15);
        numeros.add(3);
        numeros.add(29);

        // Ordenando a lista em ordem crescente
        Collections.sort(numeros);

        // Imprimindo a lista ordenada
        System.out.println("Lista ordenada: " + numeros);
    }
}
