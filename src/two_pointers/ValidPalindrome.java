package two_pointers;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama"; // false

        System.out.println(isPalindrome(s));
    } // main

    // "after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters"
    // s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // [^...] is all things NOT in the brackets
    // i feel like the regex solution is cheating...

    // s = s.toLowerCase();
    // this line is VERY costly

    public static boolean isPalindrome(String s) {
        int x = 0, y = s.length() - 1;

        while (x <= y) {
            // isolate whether it's not a letter or number
            while (!Character.isLetterOrDigit(s.charAt(x)) && x < y) { // i think we're converting to Character here
                x++;
            } // while

            while (!Character.isLetterOrDigit(s.charAt(y)) && x < y) {
                y--;
            } // while

            // we lowercase it here because at this rate we know it need to be lowercased vs lowercasing symbols and shit
            //   (i know we don't need to lowercase numbers, but it's not that big a deal compared to lowercasing everything else)
            if (Character.toLowerCase(s.charAt(x)) != Character.toLowerCase(s.charAt(y))) {
                return false;
            }
            else {
                x++;
                y--;
            }
        } // while

        return true;
    } // isPalindrome
}