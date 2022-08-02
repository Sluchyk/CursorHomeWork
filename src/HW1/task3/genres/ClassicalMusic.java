package HW1.task3.genres;
import java.security.SecureRandom;
import java.util.List;

public class ClassicalMusic implements GenrGenerator{
    @Override
    public String generateMessage() {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of(" Eine kleine Nachtmusik","Für Elise","O mio babbino caro' from Gianni Schicchi");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }
}
