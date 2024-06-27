package hashing;

import java.util.Set;
import java.util.HashSet;

public class LinkedListCycle {
    public static void main(String[] args) {


    } // main

    class ListNode {
        int val;
        ListNode next; // points to next item on list

        ListNode (int x) {
            val = x;
            next = null;
        }
    } // ListNode

    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode current = head;

        // if head == null or there's only one node, return false
        if (current == null || current.next == null) {
            return false;
        } else {
            set.add(current);
        }

        current = current.next;
        // if next == null, end of list has been reached
        while (current.next != null) {
            if (set.contains(current)) {
                return true;
            }
            else {
                set.add(current);
                current = current.next;
            }
        } // while

        // if not valid, pos = -1
        return false;
    } // hasCycle
}
