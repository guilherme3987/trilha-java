package lista_interface;

import java.util.HashSet;
import java.util.Set;

/*
O HashSet em Java não garante a ordem dos elementos. Isso significa que quando você adiciona elementos a um HashSet, eles podem não ser armazenados na ordem em que foram inseridos. A ordem depende da implementação do HashSet e do valor do hash dos elementos, que é usado internamente para organizar os elementos em buckets para permitir a busca rápida.

*/
public class ExempleHashSet {
    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        Set<String> set2 = new HashSet<>();

        set1.add("Apple");
        set1.add("Banana");

        set2.add("Strawberry");
        set2.add("Cherry");

        set1.addAll(set2);

        //Interando
        for(String lista:set1){
            System.out.println(lista);
        }
    }
    
}

/*
 *  Saída com HashSet:
    Apple
    Cherry
    Strawberry
    Banana

    Saída com LinkedHashSet
    Apple
    Banana
    Strawberry
    Cherry
    
    Saída com TreeSet
    Apple
    Banana
    Cherry
    Strawberry
 */