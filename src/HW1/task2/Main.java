package HW1.task2;
public class Main {
    public static void main(String[] args) {
            Massage massage=new Massage();
        (new Thread(new Producer(massage))).start();
        (new Thread(new Consumer(massage))).start();

    }
}
