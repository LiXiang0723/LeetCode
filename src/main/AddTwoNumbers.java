package main;

import common.SinglyLinkedList;

public class AddTwoNumbers {
    public SinglyLinkedList addTwoNumbers(SinglyLinkedList l1, SinglyLinkedList l2) {
        SinglyLinkedList head = null;
        SinglyLinkedList cursor = null;
        boolean advance = false;
        if (l1 == null || l2 == null) {
            return null;
        }
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val;
            if (advance) {
                sum += 1;
            }
            advance = sum > 9 ? true : false;

            SinglyLinkedList newNode = new SinglyLinkedList(sum % 10);
            if (head == null) {
                head = newNode;
                cursor = newNode;
            } else {
                cursor.next = newNode;
                cursor = newNode;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        if (l1 == null && l2 == null) {
            if (advance) {
                cursor.next = new SinglyLinkedList(1);
                cursor = cursor.next;
                advance = false;
            }
            return head;
        }

        while (l1 != null) {
            if (advance) {
                l1.val += 1;
                advance = false;
            }

            if (l1.val > 9) {
                advance = true;
            }
            cursor.next = new SinglyLinkedList((l1.val) % 10);
            cursor = cursor.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            if (advance) {
                l2.val += 1;
                advance = false;
            }

            if (l2.val > 9) {
                advance = true;
            }
            cursor.next = new SinglyLinkedList((l2.val) % 10);
            cursor = cursor.next;
            l2 = l2.next;
        }

        if (advance) {
            cursor.next = new SinglyLinkedList(1);
            cursor = cursor.next;
            advance = false;
        }

        return head;
    }
}