package main.java.com.sergeykarpen.javacore.chapter13.applet;
import java.awt.*;
import java.applet.Applet;

/**
<applet code = "SimpleApplet" width = 200 height = 60>
</applet>
*/



public class SimpleApplet extends Applet  {
    public void paint(Graphics g) {
        g.drawString("Простейший аплет", 20, 20);
    }
}
