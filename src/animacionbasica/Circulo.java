/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionbasica;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author victor.fernandez
 */
public class Circulo extends Figura {
    private int x;
    private int y;
    private int incrX;
    private int incrY;
    private int radio;

    public Circulo(int x, int y, int radio) {
        setColor(Color.BLACK);
        this.x = x;
        this.y = y;
        this.radio = radio;
        incrX = 5;
        incrY = 4;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
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

    public int getIncrX() {
        return incrX;
    }

    public void setIncrX(int incrX) {
        this.incrX = incrX;
    }

    public int getIncrY() {
        return incrY;
    }

    public void setIncrY(int incrY) {
        this.incrY = incrY;
    }
    
    @Override
    public void mover() {
        x += incrX;
        y += incrY;
        if (x < 20 + radio || x > 780 - radio) {
            incrX = -incrX;
        }
        if (y < 50 + radio || y > 580 - radio) {
            incrY = -incrY;
        }
        
    }

    @Override
    public void dibujar(Graphics g) {
       g.setColor(this.getColor());
       g.drawOval(x - radio, y - radio, radio * 2, radio * 2);
    }
    
    
    
}
