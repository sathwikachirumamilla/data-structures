/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic.solutions.linkedlists;

/**
 *
 * @author SujanChirumamilla
 */
public class DoubleLinkedList {

    public DoubleNode head = null;
    public DoubleNode tail = null;

    public void insertion(int data) {
        DoubleNode newNode = new DoubleNode(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void print() {
        DoubleNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        DoubleLinkedList dList = new DoubleLinkedList();

        dList.insertion(1);
        dList.insertion(2);
        dList.insertion(3);
        dList.print();
    }
}
