package HW1.task3;

import HW1.task3.genres.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        PlayList playList=new PlayList();
        playList.saveSong(new ClassicalMusic());
        playList.saveSong(new JazzMusic());
        playList.saveSong(new PopMusic());
        playList.saveSong(new RockMusic());
        playList.saveSong(new DiskoMusic());
        Thread.sleep(1000);
           playList.print();

    }
}
