package hashing;

import java.util.HashSet;

public class CheckIfTheSentenceIsPangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";

        System.out.println(checkIfPangram(sentence));;
    } // main

    public static boolean checkIfPangram(String sentence) {
        HashSet<Character> sen = new HashSet<>();

        // turn sentence into hashset
        for (int i = 0; i < sentence.length(); i++) {
            sen.add(sentence.charAt(i)); // hashsets don't allow dupes, so we don't need an if-else clause here
        } // for

        // hashset should be length 26 if it has a character for each letter of the alphabet
        return sen.size() == 26;
    } // checkIfPangram
}


/*
public boolean checkIfPangram(String sentence) {
        HashSet<Character> sen = new HashSet<>();

        // turn sentence into hashset
        for (int i = 0; i < sentence.length(); i++) {
            sen.add(sentence.charAt(i));
        } // for

        // check for each letter of alphabet
        for (char c = 'a'; c <= 'z'; c++) { // you can do this wtf lmfao
            System.out.println(c);

            if (!sen.contains(c)) {
                return false;
            }

        } // for

        return true;
    } // checkIfPangram
*/