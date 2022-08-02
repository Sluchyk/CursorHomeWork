package HW1.task1;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Fire fire=new Fire();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Thread(()->
        {
            try {
                System.out.println("Calling to FireHouse...");
                Thread.sleep(ThreadLocalRandom.current().nextInt(1000,5000));
                fire.calltoFireDepartment();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }));
        executorService.awaitTermination(20,TimeUnit.SECONDS);
        System.out.println("Fire was down");
    }
}
