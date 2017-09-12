/**
 * @author Muntaqim Elahi
 * Purpose: To display a TicTacToe game on applet
 * Created on 9/12/17
 */

import java.applet.Applet;
import java.awt.Graphics;
public class TicTacToe extends Applet{
    public void paint(Graphics g){
        g.drawLine(100,125,700,125);
        g.drawLine(250,0,250,500);
        g.drawLine(100,350,700,350);
        g.drawLine(550,0,550,500);
        g.drawLine(100,0,250,125);
        g.drawLine(100,125,250,0);
        g.drawLine(350,0,500,125);
        g.drawLine(350,125,500,0);
        g.drawLine(550,0,700,125);
        g.drawLine(550,125,700,0);
        g.drawLine(100,62,700,62);
        g.drawOval(325,162,180,180);
    }
}