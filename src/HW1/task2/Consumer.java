package HW1.task2;
//take massage
public class Consumer implements  Runnable{
    private final Massage reseivedMassage;
    public  Consumer(Massage massage)
    {
        this.reseivedMassage=massage;
    }
    @Override
    public void run() {
        String massage;
        try {

             massage =this.reseivedMassage.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Reseived massage: {"+massage+"}");

    }
}
