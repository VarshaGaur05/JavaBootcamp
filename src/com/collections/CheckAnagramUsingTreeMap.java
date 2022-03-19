package com.collections;

import java.util.*;

public class CheckAnagramUsingTreeMap {
    /*Description
You have to find if the given two strings are anagram or not. An anagram of a string is another string that contains the same characters; only the order of characters can be different. For example: “listen”, and “silent” are anagrams of each other.
Given two strings to the function isAnagram(), you have to find whether the strings are anagram or not. If the strings are anagram, you need to return true else false. You do not need to carry any input or printing operation. Just complete the function.
Hint: Try using treemap for checking the anagram string.
Input: “listen” “silent”
Output: true
Input: “caat” “cat”
Output: false
public static void main(String[] args) {

	    Scanner scanner = new Scanner (System.in);
	    String s1 = scanner.next();
	    String s2 = scanner.next();

	    System.out.println(isAnagram(s1,s2));

	}

public static boolean isAnagram(String string1, String string2){
	    //complete the function and return true or false
	     if (string1.length() != string2.length()) {
        return false;
    }

    final char[] chars1 = string1.toCharArray();
    final char[] chars2 = string2.toCharArray();

    Arrays.sort(chars1);
    Arrays.sort(chars2);

    return Arrays.equals(chars1, chars2);
	}

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String s1 = scanner.next();
        String s2 = scanner.next();

        System.out.println(isAnagram(s1,s2));

    }


    public static boolean isAnagram(String string1, String string2){

        if(string1.length()!=string2.length())
            return false;

        Map<Character, Integer> map1 = new TreeMap<>();
        Map<Character, Integer> map2 = new TreeMap<>();

        for(int i=0; i<string1.length();i++){

            char c1=string1.charAt(i);

            if(map1.containsKey(c1)){

                map1.put(c1,map1.get(c1)+1);

            }else{
                map1.put(c1,1);
            }

        }

        for(int i=0; i<string2.length();i++){

            char c1=string2.charAt(i);

            if(map2.containsKey(c1)){

                map2.put(c1,map2.get(c1)+1);

            }else{
                map2.put(c1,1);
            }
        }

        if(map1.equals(map2))
            return true;
        else return false;


    }

}
