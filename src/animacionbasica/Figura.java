package animacionbasica;
import java.awt.*;

public abstract class Figura implements Animable {

    private Color color;
    
//    public abstract void mover();
//    public abstract void dibujar(Graphics g);

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
    
}
