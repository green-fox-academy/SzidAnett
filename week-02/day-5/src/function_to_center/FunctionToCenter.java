package function_to_center;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a function that draws a single line and takes 3 parameters:
        // The x and y coordinates of the line's starting point and the graphics
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

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

            int t = 20;
            for (int i = 0; i <= 320; i+=t) {
                for (int j = 0; j <= 320; j+=t) {
                    int r = random.nextInt(256);
                    int g = random.nextInt(256);
                    int b = random.nextInt(256);
                    graphics.setColor(new Color(r, g, b));
                    if (i==0||j==0||i==320||j==320)drawLineC(i,j,graphics);

                }

            }
        }

        public static void drawLineC(int x, int y, Graphics graphics){


            graphics.drawLine(x,y,320/2,320/2);
        }
    }
}



