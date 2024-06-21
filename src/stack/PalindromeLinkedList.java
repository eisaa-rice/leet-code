package stack;

import java.util.Stack;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        // 1 2 2 1 - true

        // 1 2 - false

        // 1 2 1 - true

        // 1 2 1 2 1 - true

        // 1 2 2 2 1 - true

        // man what the fuck lmfao
    } // main

    public class ListNode {
       int val;
       ListNode next;

       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // find criteria for when to stop pushing to stack and start popping instead

    // i think i gotta work the entire list at least once

    // push entire list onto stack
    // start over, and compare stack.peek() to current list node
    //  kind of like comparing the end of the list to the start of it
    // if they don't match at any point, it's not a palindrome
    // wait im a chef wtf

    // ok this solution is slow as HELL lmfao

    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        // stack entire list
        while (current != null) {
            stack.push(current);

            current = current.next;
        }

        current = head;

        // compare end of list (stack) with start of list (segundo)
        while (current != null) {
            if (stack.peek().val != current.val) {
                return false;
            }
            else {
                stack.pop();

                current = current.next;
            }
        } // while

        return true; // stack.empty()
    } // isPalindrome
}
