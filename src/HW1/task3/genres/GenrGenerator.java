package HW1.task3.genres;

import HW1.task3.PlayList;

public interface GenrGenerator {
    String generateMessage();
     default void  generate() {
        new Thread(()-> PlayList.playList.add(generateMessage())).start();
    }



}
