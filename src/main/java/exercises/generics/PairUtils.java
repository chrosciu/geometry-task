package exercises.generics;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class PairUtils {

    public static <T,U> void printPairFields(Pair<T,U> pair) {
        System.out.println("First: " + pair.getFirst() + " Second: " + pair.getSecond());
    }

    public static <T,U> T getFirst(Pair<T,U> pair) {
        return pair.getFirst();
    }

    public static <T,U> U getSecond(Pair<T,U> pair) {
        return pair.getSecond();
    }

    public <T,U> Pair<?,?> swap(Pair<T,U> pair) {
        T first = pair.getFirst();
        U second = pair.getSecond();
        return new Pair<>(second,first);
    }
//zad.4
    public <T,U> void addToMap(Pair<T,U> pair, Map<T,U> map) {
        map.put(pair.getFirst(), pair.getSecond());
    }

    public static void testAddToMAp() {
        PairUtils pu = new PairUtils();
        Map<Integer,String> map = new HashMap<>();
        Pair<Integer, String> pair  = new Pair<>(1,"A");
        Pair<Integer, String> pair2  = new Pair<>(2,"B");
        Pair<Integer, String> pair3  = new Pair<>(3,"C");
        Pair<Integer, String> pair4  = new Pair<>(4,"D");
        pu.addToMap(pair, map);
        pu.addToMap(pair2, map);
        pu.addToMap(pair3, map);
        pu.addToMap(pair4, map);
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", value: " + entry.getValue());
        }
    }

    //zad.5

//    public <T,U,V> V combine(Pair<?,?> pair, BiFunction<T,U,V> func) {
//        return  func.apply(pair.getFirst(), pair.getSecond());
//    }
//}
