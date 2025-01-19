package LinkedList.KunalKushwaha.SinglyLinkedList;

public class LL {
    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }

        Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    private Node head;
    private int length;
    private Node tail;

    LL() {
        head = null;
        length = 0;
        tail = null;
    }

    LL(int val) {
        head = new Node(val);
        length = 1;
        tail = head;
    }

    public void addFirst(int val) {
        if (head == null) {
            head = new Node(val);
            tail = head;
            length = 1;
            return;
        }

        Node node = new Node(val);
        node.next = head;
        head = node;
        length += 1;

    }

    public void addLast(int val) {
        if (tail == null) {
            addFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = tail.next;
        length += 1;
    }

    public void add(int index, int value) {
        if (index == length) {
            addLast(value);
            return;
        }
        if (index == 0) {
            addFirst(value);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;
        length += 1;

    }

    public int removeFirst() {
        int value = -1;
        if (head != null) {
            value = head.val;
            head = head.next;
            length -= 1;
            if (head == null) {
                tail = null;
            }
        } else {
            try {
                throw new NullPointerException("List is Empty");
            } catch (Exception e) {
                e.printStackTrace();
                return -1;
            }
        }
        return value;
    }

    public int removeLast() {
        if (length <= 1) {
            return removeFirst();
        }

        int value = get(length-1).val;
        Node node = get(length-2);

        tail = node;
        tail.next = null;

        length -= 1;

        return value;
    }

    public Node get(int index){
        if(index == 0) {
            return head;
        }

        Node node = head;
        for(int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return length;
    }

    public void display() {
        if (head == null) {
            System.out.println("NULL");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }

        System.out.println("End");
    }

}
