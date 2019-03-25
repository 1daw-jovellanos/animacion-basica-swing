/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animacionbasica;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Linea extends Figura {
    
    class Extremo { // NO ENCAPSULADA
        int x;
        int y;
        int incrX;
        int incrY;

        public Extremo(int x, int y) {
            Random random = new Random();
            this.x = x;
            this.y = y;
            incrX = random.nextInt(10) + 1;
            incrY = random.nextInt(10) + 1;
            if (random.nextBoolean()) {
                incrX = -incrX;
            }
            if (random.nextBoolean()) {
                incrY = -incrY;
            }
        }
        
        public void mover() {
            x += incrX;
            y += incrY;
            if (x < Config.MARGEN_MIN_X || x > Config.MARGEN_MAX_X) {
                incrX = -incrX;
            }
            if (y < Config.MARGEN_MIN_Y || y > Config.MARGEN_MAX_Y) {
                incrY = -incrY;
            }
        }
    }

    Extremo extremo1;
    Extremo extremo2;
    
    public Linea(int x1, int y1, int x2, int y2) {
        setColor(Color.BLACK);
        extremo1 = new Extremo(x1, y1);
        extremo2 = new Extremo(x2, y2);
    }
    
    @Override
    public void mover() {
        extremo1.mover();
        extremo2.mover();
    }

    @Override
    public void dibujar(Graphics g) {
        g.setColor(this.getColor());
        g.drawLine(extremo1.x, extremo1.y, extremo2.x, extremo2.y);
    }
    
}
