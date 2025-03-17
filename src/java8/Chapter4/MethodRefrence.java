package Chapter4;

public class MethodRefrence {

    public static void print(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        System.out.println("Running...");


        // 1. Method refrence to static method

        // using lambda expression
        // Consumer<String> staticFunction = (String s) -> System.out.println(s);
        // staticFunction.accept("Hello ji");

        // using method refrence
        // Consumer<String> staConsumer = MethodRefrence::print;
        // staConsumer.accept("Hello 2");
    }
}
