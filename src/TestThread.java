public class TestThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread thread2= new Thread(evenThread);
        Thread thread1= new Thread(oddThread);
        thread1.start();
        try{
            thread1.join();
        }catch (InterruptedException e){
            System.out.println("InterruptedException");
        }
        thread2.start();
    }
}