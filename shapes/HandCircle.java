package shapes;

import java.awt.*;
import noise.Noise;

public class HandCircle extends AbstractCircle {
    private double radiusX, radiusY;
    
    public HandCircle(double cx, double cy, double radius, Color c) {
        super(cx + Noise.getNoise(), cy + Noise.getNoise(), c);
        // Créer deux rayons légèrement différents pour l'ellipse
        this.radiusX = radius + Noise.getNoise(radius);
        this.radiusY = radius + Noise.getNoise(radius);
    }
    
    @Override
    protected double getRadiusX() {
        return radiusX;
    }
    
    @Override
    protected double getRadiusY() {
        return radiusY;
    }
}
