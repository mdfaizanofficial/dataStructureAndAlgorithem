package Recursion.AdityaVerma;

import java.util.ArrayList;

public class SortArray {

    static void sort(ArrayList<Integer> list){
        if(list.size() == 1) return;

        int val = list.removeLast();
        sort(list);

        add(list, val);
    }
    static void add(ArrayList<Integer> list, int val) {
      if(list.size() == 0 || list.getLast() <= val){
        list.add(val);
        return;
      }

      int last = list.removeLast();
      add(list, val);
      list.add(last);

    }
    public static void main(String[] args) {
        System.out.println("SoryArray.main()");
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 9; i >= 0; i--){
            list.add(i);
        }

        System.out.println(list);

        sort(list);
        System.out.println(list);
    }
}
