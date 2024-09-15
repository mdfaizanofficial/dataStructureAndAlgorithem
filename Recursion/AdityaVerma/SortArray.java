package Recursion.AdityaVerma;

import java.util.ArrayList;

public class SortArray {

  static void sort(ArrayList<Integer> list) {
    if (list.size() == 1)
      return;

    int lastValue = list.removeLast();
    sort(list);

    insert(list, lastValue);
  }

  static void insert(ArrayList<Integer> list, int val) {
    if (list.isEmpty() || list.getLast() <= val) {
      list.add(val);
      return;
    }

    int lastValue = list.removeLast();
    insert(list, val);
    list.add(lastValue);

  }

  public static void main(String[] args) {
    System.out.println("SoryArray.main()");
    ArrayList<Integer> list = new ArrayList<>();

    for (int i = 9; i >= 0; i--) {
      list.add(i);
    }

    System.out.println(list);

    sort(list);
    System.out.println(list);
  }

}
