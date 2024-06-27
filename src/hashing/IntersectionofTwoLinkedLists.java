package hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoLinkedLists {
    public static void main(String[] args) {


    } // main

    class ListNode {
        int val;
        ListNode next; // points to next item on list

        ListNode(int x) {
            val = x;
            next = null;
        }
    } // ListNode

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode primero = headA;
        ListNode segundo = headB;

        // add all the nodes from first list into map
        while (primero != null) {
            set.add(primero);
            primero = primero.next;
        } // while


        // search through second list for intersection
        while (segundo != null) {
            if (set.contains(segundo)) {
                return segundo;
            }
            else {
                segundo = segundo.next;
            }
        }

        // if the two linked lists have no intersection at all, return null
        return null;
    } // getIntersectionNode
}
