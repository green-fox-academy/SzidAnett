package centered_box_function;
import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class CenteredBoxFunction {
    public static void mainDraw(Graphics graphics) {
        // create a function that draws one square and takes 2 parameters:
        // the square size and the graphics
        // and draws a square of that size to the center of the canvas.
        // draw 3 squares with that function.
        // avoid code duplication.

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

            Random random = new Random();

            for (int i = 0; i < 4; i++) {
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                graphics.setColor(new Color(r, g, b));
                }

            int[] side = new int[] {200, 250, 300};
            for (int z : side) {
                squareDrawer(z, graphics);
            }
        }
            public static void squareDrawer(int side, Graphics graphics) {
                int x = WIDTH / 2 - side / 2;
                int y = HEIGHT / 2 - side / 2;
                graphics.drawRect(x, y, side, side);
        }

            }
        }

