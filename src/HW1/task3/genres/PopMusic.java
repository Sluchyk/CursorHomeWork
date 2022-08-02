package HW1.task3.genres;

import HW1.task3.PlayList;

import java.security.SecureRandom;
import java.util.List;

public class PopMusic implements GenrGenerator{
    @Override
    public String generateMessage() {
        SecureRandom random=new SecureRandom();
        List<String> listOfMassages=List.of("Hello","Break my heart","Mood","Holy");
        return listOfMassages.get(random.nextInt(listOfMassages.size()));
    }
}
