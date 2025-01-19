package LinkedList.KunalKushwaha.SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        
        list.addFirst(10);
        list.display();

        list.addFirst(100);
        list.display();

        list.addLast(5);
        list.display();

        list.add(1, 2);
        list.display();
        System.out.println(list.size());

        list.removeLast();
        list.display();
        System.out.println(list.size());
        list.removeLast();
        list.display();
        System.out.println(list.size());
        list.removeLast();
        list.display();
        System.out.println(list.size());
        list.removeLast();
        list.display();
        System.out.println(list.size());
        list.removeLast();
        list.display();
        System.out.println(list.size());

        System.out.println("End");
    }
}
