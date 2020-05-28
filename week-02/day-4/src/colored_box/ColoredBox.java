package colored_box;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class ColoredBox {
    public static void mainDraw(Graphics graphics) {
        // Draw a box that has different colored lines on each edge.
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }
    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

            Graphics2D g2 = (Graphics2D) graphics;
            g2.setStroke(new BasicStroke(3));

            // top
            graphics.setColor(Color.BLUE);
            graphics.drawLine(50, 50, 100, 50);
            // right
            graphics.setColor(Color.RED);
            graphics.drawLine(100, 50, 100, 100);
            // bottom
            graphics.setColor(Color.ORANGE);
            graphics.drawLine(100, 100, 50, 100);
            // left
            graphics.setColor(Color.MAGENTA);
            graphics.drawLine(50, 100, 50, 50);
        }
    }
}


