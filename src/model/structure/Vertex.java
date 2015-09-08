/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model.structure;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

/**
 *
 * @author Dan Joel Canqui Aviles
 */
public class Vertex {

    private static final int DIAMETER = 10;
    private final String value;
    private int x;
    private int y;

    public Vertex(String value, int x, int y) {
        this.value = value;
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void paint(Graphics g) {
        g.setColor(Color.BLUE);
        g.drawOval(x, y, DIAMETER, DIAMETER);
        g.setColor(Color.BLACK);
        g.drawString(value, x, y);
    }
}
