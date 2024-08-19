package lista_interface;

import java.util.HashMap;
import java.util.Map;

import javax.print.DocFlavor.INPUT_STREAM;

public class ExampleHashMap {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        
        map.put("Apple",0);
        map.put("Banana", 1);
        
        System.out.println(map+"\n\n");

        for (Map.Entry<String, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + ":"+entry.getValue());
        }


    }
}
