package HW1.task3.genres;
import java.security.SecureRandom;
import java.util.List;

public class RockMusic implements GenrGenerator{
    @Override
    public String generateMessage() {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of("Back in back","Highway to hell","The end is Where We begin","Let the sparks fly");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }

}
