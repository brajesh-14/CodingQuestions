package coreJava;

import java.util.Arrays;

public class RevString {

    public static void main(String[] args) {

        // reverse String with its own place
        String[] str = {"Pragati", "Jain"};

        String[] st = new String[str.length];

        for(int i = 0; i< str.length; i++){
            String s = str[i];

            String ss = "";

            for(int j= s.length()-1; j>=0; j--){

                ss += s.charAt(j);

                st[i]= ss;
            }
        }

        System.out.println(Arrays.toString(st));
    }
}
