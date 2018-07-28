package SDA.thread;

import SDA.move.MovePerson;

import static SDA.move.CountRuch.countRuch;
import static SDA.move.MovePerson.movePerson;


public class NewThread implements Runnable {

    @Override
    public void run() {
        try {
            System.out.println("nowy watek");
            countRuch();
            movePerson();
            //interrupt();

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("poszło dalej");
        }
    }


//    private static void interrupt() {
//        Thread.currentThread().stop();
//    }
}
