class RunnableExample{
    public static void main(String[] args) {

        


        RunnableImp runnableImp = new RunnableImp();

        Thread thread = new Thread(runnableImp);
        thread.start();

        // Runnable runnable = () -> System.out.println("Lambda demo");
        Thread t2 = new Thread(() -> System.out.println("Lambda demo"));
        t2.start();



        // Thread t1 = new Thread(()->{
        //     for (int i = 0; i < 100; i++) {
        //         System.out.println("t1 : ");
        //     }
        // });

        // Thread t2 = new Thread(()->{
        //     for (int i = 0; i < 100; i++) {
        //         System.out.println("t2 : ");
        //     }
        // });


        // t1.start();
        // t2.start();
    }
}

class RunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println("Thred 1");
    }
    
}