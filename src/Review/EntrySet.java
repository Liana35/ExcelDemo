package Review;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntrySet {
    public static void main(String[] args) {
        Map<String, Double> friutMap = new HashMap<>();
        friutMap.put("Soap", 12.5);
        friutMap.put("Banana", 4.9);
        friutMap.put("Dragon Fruit", 5.6);
        friutMap.put("Spear", 16.5);
        friutMap.put("Orange", 15.5);
        friutMap.put("Mango", 10.6);

/*
        Set<Map.Entry<String, Double> > entrySet= friutMap.entrySet();
        for(Map.Entry<String, Double>  entry:entrySet){

            System.out.println(entry.getValue());

            System.out.println(entry.getKey()+" "+entry.getValue());
        }

        entrySet.removeIf(x->x.getValue()>2&& x.getKey().contains("i"));*/

        var entrySet= friutMap.entrySet();
        for(var entry: entrySet){
            String key=entry.getKey();  // multiple && and || conditions - we have to put extra - ()
            if((key.contains("a")||key.contains("e"))&&entry.getValue()>8){
                System.out.println(key+" "+entry.getValue());
            }
        }


    }
    }

