package shapes;

public interface AbstractLine extends Drawable {
    double getX0();
    double getY0();
    double getX1();
    double getY1();
    
    default double getLength() {
        double dx = Math.abs(getX1() - getX0());
        double dy = Math.abs(getY1() - getY0());
        return Math.sqrt(dx * dx + dy * dy);
    }
}