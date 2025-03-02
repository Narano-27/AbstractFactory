package shapes;
import java.awt.*;
import noise.Noise;

public class HandCircle implements AbstractCircle {
    private double cx, cy, radiusX, radiusY;
    private Color c;
    
    public HandCircle(double cx, double cy, double radius, Color c) {
        this.cx = cx + Noise.getNoise();
        this.cy = cy + Noise.getNoise();
        // Créer deux rayons légèrement différents pour l'ellipse
        this.radiusX = radius + Noise.getNoise(radius);
        this.radiusY = radius + Noise.getNoise(radius);
        this.c = c;
    }
    
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
        return radiusX;
    }
    
    @Override
    public double getRadiusY() {
        return radiusY;
    }
    
    @Override
    public Color getColor() {
        return c;
    }
}