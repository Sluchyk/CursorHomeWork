package HW1.task3;

import HW1.task3.genres.GenrGenerator;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class PlayList {
    public  static List<String> playList=new CopyOnWriteArrayList<>();
    public void  saveSong(GenrGenerator genrGenerator)
    {
        genrGenerator.generate();
    }
    public void print()
    {
        System.out.println(playList.toString());
    }

}
