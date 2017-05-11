package dado;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author carlos
 */
public class CdDado extends JPanel {

    private int cara;
    
    public CdDado(int dado){
        cara=dado;
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        switch (cara) {
            case 1:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(135, 135, 40, 40);
                break;
            case 2:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(40, 40, 40, 40);
                g.fillOval(220, 220, 40, 40);
                break;
            case 3:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(40, 40, 40, 40);
                g.fillOval(220, 220, 40, 40);
                g.fillOval(135, 135, 40, 40);
                break;
            case 4:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(40, 40, 40, 40);
                g.fillOval(220, 220, 40, 40);
                g.fillOval(220, 40, 40, 40);
                g.fillOval(40, 220, 40, 40);
                break;
            case 5:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(40, 40, 40, 40);
                g.fillOval(220, 220, 40, 40);
                g.fillOval(220, 40, 40, 40);
                g.fillOval(40, 220, 40, 40);
                g.fillOval(135, 135, 40, 40);
                break;
            case 6:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 300, 300);
                g.setColor(Color.BLACK);
                g.fillOval(40, 40, 40, 40);
                g.fillOval(220, 220, 40, 40);
                g.fillOval(220, 40, 40, 40);
                g.fillOval(40, 220, 40, 40);
                g.fillOval(40, 135, 40, 40);
                g.fillOval(220, 135, 40, 40);
        }
    }
}
