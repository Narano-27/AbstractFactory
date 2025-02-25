package viewer;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import javax.swing.*;

import shapes.Drawable;
import shapes.ShapeFactory;
import shapes.NormalShapeFactory;

public class GraphicViewer extends JFrame {
    private final int width = 800;
    private final int height = 600;
    private Graphics2D onscreen;
    private ShapeFactory factory;
    
    public GraphicViewer() {
        // Par défaut, on utilise la factory normale
        this.factory = new NormalShapeFactory();
        
        setVisible(true);
        setSize(width, height);
        setTitle("Afficheur de dessin");

        BufferedImage onscreenImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        ImageIcon icon = new ImageIcon(onscreenImage);
        JLabel draw = new JLabel(icon);

        getContentPane().add(draw);
        onscreen = onscreenImage.createGraphics();
        
        // Closing any view will quit :
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    
    public void setShapeFactory(ShapeFactory factory) {
        this.factory = factory;
    }
    
    public ShapeFactory getShapeFactory() {
        return this.factory;
    }
    
    public void draw(java.util.List<Drawable> shapes) {
        // Effacer le contenu précédent
        onscreen.setColor(Color.WHITE);
        onscreen.fillRect(0, 0, width, height);
        
        for (Drawable shape : shapes) {
            shape.draw(onscreen);
        }
        repaint(100);
    }
}