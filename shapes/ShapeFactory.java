package shapes;
import java.awt.Color;

public interface ShapeFactory {
    Drawable createLine(double x0, double y0, double x1, double y1, Color c);
    Drawable createRectangle(double x0, double y0, double x1, double y1, Color c);
    Drawable createCircle(double cx, double cy, double rad, Color c);
}