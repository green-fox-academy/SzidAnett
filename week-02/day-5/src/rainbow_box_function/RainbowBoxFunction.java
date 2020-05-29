package rainbow_box_function;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import java.awt.*;
import static java.awt.Color.cyan;
import static java.awt.Color.magenta;
import static java.awt.Color.red;
import static java.awt.Color.orange;
import static java.awt.Color.yellow;
import static java.awt.Color.green;
import static java.awt.Color.blue;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class RainbowBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares (red, orange, yellow, green, blue, indigo, violet).

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

            Color[] colors = {red, orange, yellow, green, blue, magenta, cyan};
            int side = 250;
            for (Color value : colors) {
                squareDrawer(side, value, graphics);
                side -= 30;
            }
        }

        public static void squareDrawer(int side, Color color, Graphics graphics) {
            int x = WIDTH / 2 - side / 2;
            int y = HEIGHT / 2 - side / 2;
            graphics.setColor(color);
            graphics.fillRect(x, y, side, side);
        }
    }
}


