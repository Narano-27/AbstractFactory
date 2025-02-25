package shapes;
import java.awt.Color;

public class NormalShapeFactory implements ShapeFactory {
    @Override
    public Drawable createLine(double x0, double y0, double x1, double y1, Color c) {
        return new Line(x0, y0, x1, y1, c);
    }

    @Override
    public Drawable createRectangle(double x0, double y0, double x1, double y1, Color c) {
        return new Rectangle(x0, y0, x1, y1, c);
    }

    @Override
    public Drawable createCircle(double cx, double cy, double rad, Color c) {
        return new Circle(cx, cy, rad, c);
    }
}