package LinkedList.KunalKushwaha.SinglyLinkedList;

public class LL {

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

    public void insertAt(int index, int value) {
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

    // insert using recursion...
    public void insertRec(int value, int idx) {
        Node node = head;
        insertRec(value, idx, node);
    }

    private void insertRec(int value, int idx, Node curr) {
        if (idx <= 1) {
            if (idx == 0) {
                Node node = new Node(value);
                node.next = head;
                head = node;
                length++;
                return;
            } else {

                Node node = new Node(value);
                node.next = curr.next;
                curr.next = node;
                length++;
                return;
            }
        }
        if (curr.next != null) {
            idx--;
            curr = curr.next;
            insertRec(value, idx, curr);
        } else {
            try {
                throw new IndexOutOfBoundsException("Index out of bound!!!");
            } catch (Exception e) {
                // TODO: handle exception
                e.printStackTrace();
                return;
            }
        }
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

        int value = get(length - 1).val;
        Node node = get(length - 2);

        tail = node;
        tail.next = null;

        length -= 1;

        return value;
    }

    public Node get(int index) {
        if (index == 0) {
            return head;
        }

        Node node = head;
        for (int i = 1; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int size() {
        return length;
    }   

    public void reverse() {
        if(head == null || head.next == null) return;

        Node p = null;
        Node c = head;
        Node n = null;

        while(c != null) {
            n = c.next;
            c.next = p;
            p = c;
            c = n;
        }
        this.head = p;
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
