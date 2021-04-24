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
public class InsertationAndDeletion {

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
            System.out.println("the output is ");
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "--->");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    public boolean search(int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == value) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public void delection(int value) {
        Node temp = head;
        Node prev = null;

        if (temp.data == value && prev == null) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != value) {
            prev = temp;
            temp = temp.next;
        }
        if(temp == null){
            return;
        }
        prev.next = temp.next;
    }

    public static void main(String[] args) {
        InsertationAndDeletion list = new InsertationAndDeletion();

        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        list.print();
        

        list.delection(1);
        list.print();
        list.delection(7);    

        list.print();
    }
}
