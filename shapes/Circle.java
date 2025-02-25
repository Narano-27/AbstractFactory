package shapes;

import java.awt.*;

public class Circle extends AbstractCircle {
    private double rad;
    
    public Circle(double cx, double cy, double rad, Color c) {
        super(cx, cy, c);
        this.rad = rad;
    }
    
    // Méthode propre à Circle
    public double getRadius() {
        return rad;
    }
    
    // Implémentation des méthodes abstraites
    @Override
    protected double getRadiusX() {
        return rad;
    }
    
    @Override
    protected double getRadiusY() {
        return rad;
    }
}
