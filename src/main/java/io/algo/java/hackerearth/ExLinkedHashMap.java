package io.algo.java.hackerearth;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExLinkedHashMap<K,V>  extends LinkedHashMap<Integer,Integer>{

    public static void main(String[] args) {
        ExLinkedHashMap<Integer,Integer> exMap = new ExLinkedHashMap<> ();
        exMap.put ( 1,100 );
        exMap.put(2,99);
        System.out.println ();
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return super.removeEldestEntry ( eldest );
    }
}
