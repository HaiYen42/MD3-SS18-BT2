public class EvenThread implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 0; i <=10; i++) {
                if (i%2==0) {
                    System.out.println("Even Number "+ i);
                }
            }
        Thread.sleep(10);
        } catch (InterruptedException e) {
            System.out.println("InterruptedException");
        }
    }
}

