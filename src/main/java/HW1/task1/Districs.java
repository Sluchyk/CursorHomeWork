package HW1.task1;
import java.security.SecureRandom;
import java.util.List;

public class Districs {
    private final List<District> location =List.of(new District("Center",40),
            new District("Downtown",30),
            new District("Chinatown",50)
    );
    public  District generateRandomDistrict()
               {
                   SecureRandom random=new SecureRandom();
                   return  location.get(random.nextInt(location.size()));
               }
}
