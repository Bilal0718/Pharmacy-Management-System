package main;

import javax.swing.JFrame;
import javax.swing.Timer;


public class Main {

    public static void main(String[] args) {
        JFrame firstFrame = new SplashScreen();
        JFrame secondFrame = new Login();

        //Set Timer of Splash Screen for 5 Seconds
        secondFrame.setVisible(false);
        Timer timer = new Timer(5000, e -> {
            firstFrame.setVisible(false);
            if (firstFrame.isActive()) {
                secondFrame.setVisible(true);
            }
        });

        firstFrame.setVisible(true);
        timer.start();
    }
    
}
