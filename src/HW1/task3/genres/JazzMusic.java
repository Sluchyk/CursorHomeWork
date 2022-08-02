package HW1.task3.genres;
import java.security.SecureRandom;
import java.util.List;

public class JazzMusic implements GenrGenerator{
    @Override
    public String generateMessage() {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of("Let my People go","I Got you","Je Veux");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }
}
