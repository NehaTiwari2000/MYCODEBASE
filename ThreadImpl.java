public class ThreadImpl extends Thread {
    @Override
    public void run() {
        System.out.println("Thread extended method is called");
    }

    public static void main(String[] args) {
        ThreadImpl thread = new ThreadImpl();
        thread.start();

        Thread1 thread11= new Thread1();
        Thread threadRun = new Thread(thread11);
        threadRun.start();



        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("I am anonymous class  expression.....");
            }
        };
        Thread anonymousThread= new Thread(runnable);
        anonymousThread.start();


        Runnable run = ()->{
            System.out.println("lambd expression");
        };
        Thread lamdbaThread= new Thread(run);
        lamdbaThread.start();

    }
}

class Thread1 implements Runnable{

    @Override
    public void run() {
        System.out.println("Run method of runnable;");
    }
}
