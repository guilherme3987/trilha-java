package lista_interface;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/*
 * Em listas (ArrayList, LinkedList), os elementos são adicionados na ordem em que aparecem na coleção fornecida.
 * Em conjuntos (HashSet, TreeSet), a ordem dos elementos é determinada pelo tipo de conjunto e suas características (por exemplo, HashSet não garante ordem, enquanto TreeSet mantém a ordem natural).
 */
public class Exemple {

    public static void main(String[] args) {
        //Instâncias do tipo String List
        List<String> arryListGenerics = new ArrayList<>();

        List<String> arryListGenerics2 = new ArrayList<>();
        
        //Métodos
        
        arryListGenerics.add("Apple");
        arryListGenerics.add("Banana");
        
        arryListGenerics2.add(null);

        arryListGenerics.set(0, "Blueberry");
        System.out.println(arryListGenerics);
        System.out.println(arryListGenerics.getFirst());
        System.out.println(arryListGenerics.getClass());
        System.out.println(arryListGenerics.addAll(arryListGenerics2));
        System.out.println(arryListGenerics);

        for (String lista: arryListGenerics ){
            System.out.println(lista);
        }

        //LinkedList
        List<String> lista1 = new LinkedList<>();

        lista1.add("Orange");
        lista1.add("Strawberry");

        System.out.println(lista1);
        System.out.println(lista1.getFirst());
        System.out.println(lista1.getClass());
        System.out.println(lista1.addAll(arryListGenerics2));
        System.out.println(lista1);

    }
}