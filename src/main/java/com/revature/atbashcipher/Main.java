package com.revature.atbashcipher;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(atbash("apple").equals("zkkov"));
        System.out.println(atbash("Hello world!").equals("Svool dliow!"));
        System.out.println(atbash("Christmas is the 25th of December").equals("Xsirhgnzh rh gsv 25gs lu Wvxvnyvi"));
    }

    public static String atbash(String in) {
        char[] inArr = in.toCharArray();
        char[] outArr = new char[in.length()];
        char[] letters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (int i=0; i<in.length(); i++) {
            try {
                int index = Arrays.binarySearch(letters, Character.toLowerCase(inArr[i]));
                if (Character.isLowerCase(inArr[i])) {
                    outArr[i] = letters[25-index];
                } else {
                    outArr[i] = Character.toUpperCase(letters[25-index]);
                }
            } catch (ArrayIndexOutOfBoundsException e){
                outArr[i] = inArr[i];
            }
        }
        return String.valueOf(outArr);
    }
}

