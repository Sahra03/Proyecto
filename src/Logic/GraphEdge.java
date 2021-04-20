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
public class GraphEdge {

    private int x1;
    private int x2;
    private int y1;
    private int y2;
    private float weight;
    private GraphVertex start;
    private GraphVertex end;

    public GraphEdge(int x1, int x2, int y1, int y2, float weight, GraphVertex start, GraphVertex end) {

        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.weight = weight;
        this.start = start;
        this.end = end;

    }

    public GraphVertex getEnd() {
        return end;
    }

    public void setEnd(GraphVertex end) {
        this.end = end;
    }

    public void paint(Graphics g) {

        g.setColor(new Color(43, 175, 208));
        g.drawLine(x1, y1, x2, y2);

        if (this.x1 > this.x2 && this.y1 > this.y2) {
            g.setColor(new Color(255, 255, 255));
            g.drawString(Float.toString(this.weight), this.x1 - Math.abs((this.x1 - this.x2) / 2), this.y1 - Math.abs((this.y1 - this.y2) / 2));
        }

        if (this.x1 < this.x2 && this.y1 < this.y2) {
            g.setColor(new Color(255, 255, 255));
            g.drawString(Float.toString(this.weight), this.x2 - Math.abs((this.x1 - this.x2) / 2), this.y2 - Math.abs((this.y1 - this.y2) / 2));
        }

        if (this.x1 > this.x2 && this.y1 < this.y2) {
            g.setColor(new Color(255, 255, 255));
            g.drawString(Float.toString(this.weight), this.x1 - Math.abs((this.x1 - this.x2) / 2), this.y2 - Math.abs((this.y1 - this.y2) / 2));
        }

        if (this.x1 < this.x2 && this.y1 > this.y2) {
            g.setColor(new Color(255, 255, 255));
            g.drawString(Float.toString(this.weight), this.x2 - Math.abs((this.x1 - this.x2) / 2), this.y1 - Math.abs((this.y1 - this.y2) / 2));
        }

    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public GraphVertex getStart() {
        return start;
    }

    public void setStart(GraphVertex start) {
        this.start = start;
    }

}
