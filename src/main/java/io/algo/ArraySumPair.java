package io.algo;

import java.util.HashSet;

public class ArraySumPair {


    public static void main(String[] args) {
        int[] numbers = {9,4,2,7,8,3,0,-1,5};

        HashSet<Integer> pairset = new HashSet<Integer>();
        int sum = 7;
        for(int value : numbers)
        {
            int target = sum - value;
            if(!pairset.contains(target)){ pairset.add(value); }
            else { System.out.printf("(%d, %d) %n", value, target); }
        }

        for(int num :pairset){
            System.out.println(num);
        }


    }

}
