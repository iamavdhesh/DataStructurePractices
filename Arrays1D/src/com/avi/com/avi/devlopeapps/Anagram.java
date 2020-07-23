package com.avi.devlopeapps;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str = "Mary";
        String str1 = "Army";

        if (isAnagram(str.toLowerCase().toCharArray(),str1.toLowerCase().toCharArray()))
            System.out.println("Anagram String");
        else
            System.out.println("Not a Anagram String");
    }

     static boolean isAnagram(char[] strArr, char[] strArr1) {
        if (strArr.length != strArr1.length)
            return false;

        Arrays.sort(strArr);
        Arrays.sort(strArr1);
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i] != strArr1[i]) {
                return false;
            }
        }
        return true;
    }
}
