package io.algo.java.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class VowelSearch {

    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader ( new InputStreamReader ( System.in ) );
        String line = buff.readLine ();
        int N = Integer.parseInt ( line );

        for (int i = 0; i < N; i++) {
            String ln2 = buff.readLine ();
            findVowel ( ln2 );
        }
    }


     public static void findVowel(String str){
         ArrayList<Character> chList = new ArrayList<> (  );
         chList.add('a');
         chList.add('e');
         chList.add('i');
         chList.add('o');
         chList.add('u');

         System.out.println ( str.toLowerCase ().chars ().mapToObj (i -> (char)i).filter(ch -> chList.contains ( ch ) ).count ());
    }


}
