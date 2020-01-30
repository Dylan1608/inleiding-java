package h02;

import java.applet.Applet;
import java.awt.*;

public class Show extends Applet {

    @Override
    public void init() {

    }

    //een methode die de inhoud van het scherm tekent
    public void paint(Graphics g) {
        g.drawString("Welcome to Java!!", 50, 60 );
    }
}
