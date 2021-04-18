/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author JD101
 */
public class GraphVertex {

    private int x;
    private int y;
    public static final int diameter = 60;
    private String name;

    public GraphVertex(int x, int y, String name) {

        this.x = x;
        this.y = y;
        this.name = name;

    }

    GraphVertex(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void paint(Graphics g) {
        
        g.setColor(new Color(182, 133, 235));
        g.drawOval(this.x - this.diameter / 2, this.y - this.diameter / 2, this.diameter, this.diameter);
        g.fillOval(this.x - this.diameter / 2, this.y - this.diameter / 2, this.diameter, this.diameter);
        g.setColor(new Color(255, 255, 255));
        g.drawString(this.name, this.x, this.y);
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
