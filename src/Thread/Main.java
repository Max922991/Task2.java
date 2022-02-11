package Thread;

public class Main {
    public static void main(String[] args) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from cat thread");

            }
        })
        .start();
        System.out.println("Hello from main thread");
    }
}
