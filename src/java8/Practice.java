import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(43);
        list.add(403);
        list.add(4332);
        list.add(45);
        list.add(34);
        list.add(234);

        list.stream().filter(val -> val > 100).forEach(val -> System.out.println(val));
    }
}
