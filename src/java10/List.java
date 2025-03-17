package java10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

class Practice {
    public static void main(String[] args) {
        System.out.println("Hello java10");

        var num = 10;
        System.out.println(num);

        var s = "Hello world";
        System.out.println(s);

        var arr = new int[10];
        System.out.println(Arrays.toString(arr));

        var list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        System.out.println(list);

        var map = new HashMap<Integer, Integer>();
        map.put(2, 100);

        for (var entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List li = new List(100);
        li.display();
        li.add(200);
        li.display();

        var l2 = new List(10);
        l2.display();

    }
}

public class List {

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private int size;

    List() {
        this.head = null;
        size = 0;
    }

    List(int val) {
        this.head = new Node(val);
        size = 1;
    }

    void add(int val) {
        if (head == null) {
            head = new Node(val);
            size = 1;
            return;
        }
        Node node = head;

        while (node.next != null) {
            node = node.next;
        }

        node.next = new Node(val);
        size+=1;
        return;
    }

    int size(){
        return this.size;
    }

    void display() {
        Node node = head;

        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }

        System.out.println("End");
    }
}