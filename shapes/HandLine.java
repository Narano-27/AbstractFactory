package shapes;
import java.awt.*;
import java.awt.geom.*;
import noise.Noise;

public class HandLine implements Drawable  {
    private double x0, y0, x1, y1;
    private double controlX, controlY;
    private Color c;
    
    public HandLine(double x0, double y0, double x1, double y1, Color c) {
        // Ajouter du bruit à l'origine et à l'arrivée
        this.x0 = x0 + Noise.getNoise();
        this.y0 = y0 + Noise.getNoise();
        this.x1 = x1 + Noise.getNoise();
        this.y1 = y1 + Noise.getNoise();
        
        // Calculer le point de contrôle au milieu
        double midX = (this.x0 + this.x1) / 2;
        double midY = (this.y0 + this.y1) / 2;
        
        // Longueur du segment pour déterminer l'amplitude du bruit
        double length = Math.sqrt(Math.pow(this.x1 - this.x0, 2) + Math.pow(this.y1 - this.y0, 2));
        
        // Ajouter du bruit au point de contrôle
        this.controlX = midX + Noise.getNoise(length);
        this.controlY = midY + Noise.getNoise(length);
        
        this.c = c;
    }

    @Override
    public void draw(Graphics2D screen) {
        screen.setColor(c);
        QuadCurve2D curve = new QuadCurve2D.Double(x0, y0, controlX, controlY, x1, y1);
        screen.draw(curve);
    }
    
    // Getter pour les classes qui en ont besoin (comme HandRectangle)
    public double getX0() { return x0; }
    public double getY0() { return y0; }
    public double getX1() { return x1; }
    public double getY1() { return y1; }
}