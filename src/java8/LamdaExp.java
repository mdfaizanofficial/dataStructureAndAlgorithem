public class LamdaExp {
    public static void main(String[] args) {

        MyInterface obj0 = (a,b) -> a+b;
        obj0.sum(2, 1);

        System.out.println(obj0.sum(10,20));


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