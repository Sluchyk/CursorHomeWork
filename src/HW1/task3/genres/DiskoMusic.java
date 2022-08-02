package HW1.task3.genres;
import java.security.SecureRandom;
import java.util.List;
public class DiskoMusic implements GenrGenerator{
    @Override
    public String generateMessage() {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of("Love is in the Air","Rock the Boat");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }
}
