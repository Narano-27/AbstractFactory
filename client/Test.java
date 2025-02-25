package client;
import java.awt.event.*;
import java.awt.image.*;
import java.awt.geom.*;
import java.awt.Color;
import java.util.*;

import shapes.*;
import viewer.GraphicViewer;

public class Test {
    public static java.util.List<Drawable> createDemo(ShapeFactory factory) {
        java.util.List<Drawable> ls = new ArrayList<Drawable>();
        ls.add(factory.createLine(0, 500, 800, 500, Color.YELLOW));
        ls.add(factory.createLine(300, 0, 0, 300, Color.YELLOW));
        
        ls.add(factory.createLine(30, 300, 180, 200, Color.BLUE));
        ls.add(factory.createLine(330, 300, 180, 200, Color.BLUE));
        ls.add(factory.createRectangle(30, 300, 330, 500, Color.RED));
        
        double sunX = 600;
        double sunY = 120;
        double sunRad = 60;
        ls.add(factory.createCircle(sunX, sunY, sunRad, Color.BLACK));
        int sunRay = 20;
        for (int i = 0; i < sunRay; ++i) {
            double tau = i * 2 * Math.PI / sunRay;
            ls.add(factory.createLine(
                sunX + (sunRad + 5) * Math.cos(tau),
                sunY - (sunRad + 5) * Math.sin(tau),
                sunX + (1.5 * sunRad + 5) * Math.cos(tau),
                sunY - (1.5 * sunRad + 5) * Math.sin(tau),
                Color.BLACK
            ));
        }
        
        double manX = 600;
        double manY = 450;
        ls.add(factory.createLine(manX, manY - 70, manX - 40, manY - 110, Color.RED));
        ls.add(factory.createLine(manX, manY - 70, manX + 40, manY - 110, Color.RED));
        ls.add(factory.createCircle(manX, manY - 120, 20, Color.GRAY));
        ls.add(factory.createLine(manX, manY, manX, manY - 100, Color.BLUE));
        ls.add(factory.createLine(manX, manY, manX - 20, manY + 50, Color.BLACK));
        ls.add(factory.createLine(manX, manY, manX + 20, manY + 50, Color.BLACK));
        
        return ls;
    }
    
    public static void main(String[] args) {
        GraphicViewer gv = new GraphicViewer();
        
        // Afficher d'abord avec le style normal
        ShapeFactory normalFactory = new NormalShapeFactory();
        java.util.List<Drawable> normalDemo = createDemo(normalFactory);
        gv.draw(normalDemo);
        

        // wait 5 sec to draw with hand
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        ShapeFactory handDrawnFactory = new HandDrawnShapeFactory();
        java.util.List<Drawable> handDrawnDemo = createDemo(handDrawnFactory);
        gv.draw(handDrawnDemo);
    }
}
