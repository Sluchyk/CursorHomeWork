package HW1.task1;
import java.util.concurrent.*;
public class FireDepartment
{
    ThreadPoolExecutor executor;
    FireDepartment()
    {
        executor=new ThreadPoolExecutor(1,4,0,TimeUnit.MILLISECONDS,new LinkedBlockingDeque<>());
    }
    public  Future<?> call(District district)
    {
        System.out.println("Call was taken");
        return executor.submit(()-> calculateTimeOfArrival(district));
    }
     private Future<?> calculateTimeOfArrival(District district)
     {
         return executor.submit(()->{
             long time =district.getDistance()/6;
             try {
                 Thread.sleep(time);
             } catch (InterruptedException e) {
                 throw new RuntimeException(e);
             }
             System.out.println("Firedepartment`s group will be at "+district.getDistricsName()+" in "+time+" minutes");
         });
     }
}
