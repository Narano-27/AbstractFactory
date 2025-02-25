package shapes;

import java.awt.*;

public abstract class AbstractLine implements Drawable {
    protected double x0, y0, x1, y1;
    protected Color c;
    
    public AbstractLine(double x0, double y0, double x1, double y1, Color c) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.c = c;
    }
    
    // Méthode commune pour calculer la longueur
    public double getLength() {
        double dx = Math.abs(x1 - x0);
        double dy = Math.abs(y1 - y0);
        return Math.sqrt(dx * dx + dy * dy);
    }
    
    // Méthode abstraite pour le rendu
    @Override
    public abstract void draw(Graphics2D screen);
    
    // Getters communs
    public double getX0() { return x0; }
    public double getY0() { return y0; }
    public double getX1() { return x1; }
    public double getY1() { return y1; }
}