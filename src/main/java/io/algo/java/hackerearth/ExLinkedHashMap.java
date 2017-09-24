package io.algo.java.hackerearth;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExLinkedHashMap<K,V>  extends LinkedHashMap<K,V>{


    public ExLinkedHashMap(int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor, true);
    }

    public static void main(String[] args) {
        ExLinkedHashMap<Integer,Integer> exMap = new ExLinkedHashMap<>(3,0.75f);
        exMap.put ( 1,100 );
        exMap.put(2,99);
        exMap.put(3,98);
        System.out.println ( exMap.get (1));
        exMap.put(4,97);
        System.out.println ( exMap);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return super.removeEldestEntry ( eldest );
    }
}
