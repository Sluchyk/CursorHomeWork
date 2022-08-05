package HW1.task2;
import java.security.SecureRandom;
import java.util.List;
//receive message
public class Producer implements  Runnable {
    private final Massage massage;
    public  Producer(Massage massage)
    {
        this.massage=massage;
    }
    @Override
    public void run() {
        try {
            massage.send(generateMassage());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    private  String generateMassage()
    {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of("Hi","Hello","What`s up?","How is it going?");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }
}
