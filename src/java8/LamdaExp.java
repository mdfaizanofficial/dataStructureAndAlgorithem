public class LamdaExp {
    public static void main(String[] args) {
        MyInterface obj = (a, b) -> {
            System.out.println(a + b);
            return a + b;
        };
        System.out.println(obj.sum(2, 3));
    }
}

interface MyInterface{
    int  sum(int a, int b);
    
}