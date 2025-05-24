package org.example.test.socket;

import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) {
        Sender sender = new Sender("localhost",1050);
        String msg = "Hello World";
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            public void run() {
                sender.send(msg);
            }
        },1000,1000);
    }
}
