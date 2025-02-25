package shapes;

import java.awt.*;
import java.awt.geom.*;

public abstract class AbstractCircle implements Drawable {
    protected double cx, cy;
    protected Color c;
    
    public AbstractCircle(double cx, double cy, Color c) {
        this.cx = cx;
        this.cy = cy;
        this.c = c;
    }
    
    protected abstract double getRadiusX();
    
    protected abstract double getRadiusY();
    
    @Override
    public void draw(Graphics2D screen) {
        screen.setColor(c);
        screen.draw(new Ellipse2D.Double(
            cx - getRadiusX(), 
            cy - getRadiusY(), 
            getRadiusX() * 2, 
            getRadiusY() * 2
        ));
    }
}