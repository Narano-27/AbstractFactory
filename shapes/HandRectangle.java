package shapes;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class HandRectangle implements Drawable {
    private List<HandLine> lines;
    public HandRectangle(double x0, double y0, double x1, double y1, Color c) {
        lines = new ArrayList<>();
        
        lines.add(new HandLine(x0, y0, x1, y0, c)); // Haut
        lines.add(new HandLine(x1, y0, x1, y1, c)); // Droite
        lines.add(new HandLine(x1, y1, x0, y1, c)); // Bas
        lines.add(new HandLine(x0, y1, x0, y0, c)); // Gauche
    }
    
    @Override
    public void draw(Graphics2D screen) {
        for (HandLine line : lines) {
            line.draw(screen);
        }
    }
}
