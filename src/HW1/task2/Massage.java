package HW1.task2;

public class Massage {
    private   String contexOfMassage;
    private  boolean isEmpty=true;
    public  synchronized void send (String massage) throws InterruptedException {
        while (!isEmpty)
        {
            wait();
        }
        isEmpty=false;
        this.contexOfMassage=massage;
        System.out.println("Massage:"+"{"+massage+"} was sent");
        notify();
    }
    public synchronized String take() throws InterruptedException {
            while (isEmpty)
            {
                wait();
            }
            isEmpty=true;
        notify();
        return contexOfMassage;
    }
}
