package shapes;
import java.awt.*;
import java.awt.geom.*;

public interface AbstractCircle extends Drawable {
    // Méthodes pour obtenir les coordonnées du centre
    double getCx();
    double getCy();
    
    // Méthodes pour obtenir les rayons
    double getRadiusX();
    double getRadiusY();
    
    // Méthode pour obtenir la couleur
    Color getColor();
    
    // Implémentation par défaut de la méthode draw (disponible depuis Java 8)
    @Override
    default void draw(Graphics2D screen) {
        screen.setColor(getColor());
        screen.draw(new Ellipse2D.Double(
            getCx() - getRadiusX(),
            getCy() - getRadiusY(),
            getRadiusX() * 2,
            getRadiusY() * 2
        ));
    }
}