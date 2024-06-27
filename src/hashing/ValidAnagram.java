package hashing;

import java.util.Map;
import java.util.HashMap;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "ttt";
        String t = "tts";

        System.out.println(isAnagram(s, t));
    } // main

    static boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>(); // {char, numOfAppearances}

        // different size strings cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // get every char and number of instances from S
        for (char i : s.toCharArray()) { // "for char i in every char in S"
            // getOrDefault allows us to pop in a default value if it's fresh new char
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        // check difference between S and T
        for (char j : t.toCharArray()) {
            map.put(j, map.getOrDefault(j, 0) - 1);
        }

        // check for non-zero frequencies
        for (int k : map.values()) { // special for loop iterates through every element once
            if (k != 0) {
                return false;
            }
        }

        return true;
    } // isAnagram
}
