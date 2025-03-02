package shapes;
import java.awt.*;

public class Circle implements AbstractCircle {
    private double cx, cy, rad;
    private Color c;
    
    public Circle(double cx, double cy, double rad, Color c) {
        this.cx = cx;
        this.cy = cy;
        this.rad = rad;
        this.c = c;
    }
    
    // Méthode propre à Circle
    public double getRadius() {
        return rad;
    }
    
    // Implémentation des méthodes de l'interface
    @Override
    public double getCx() {
        return cx;
    }
    
    @Override
    public double getCy() {
        return cy;
    }
    
    @Override
    public double getRadiusX() {
        return rad;
    }
    
    @Override
    public double getRadiusY() {
        return rad;
    }
    
    @Override
    public Color getColor() {
        return c;
    }
}