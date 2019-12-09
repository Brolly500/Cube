import java.awt.*;
import javax.swing.*;


public class Window extends JFrame {
    public Window(Cube c){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(200,269,543,111);
        this.setTitle("Cube");
        this.setVisible(true);
    }

    void drawCube(Cube c){
        Graphics g = this.getGraphics();
        drawFacet(c.facets[0],g);
        drawFacet(c.facets[1],g);
        drawFacet(c.facets[2],g);
        drawFacet(c.facets[3],g);
        drawFacet(c.facets[4],g);
        drawFacet(c.facets[5],g);

    }
    static void drawFacet(Facet f, Graphics g){
        g.drawLine();
    }
}
