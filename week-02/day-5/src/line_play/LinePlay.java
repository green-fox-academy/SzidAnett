package line_play;
import javax.swing.*;
import java.awt.*;
import java.util.Random;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class LinePlay {

        public static void mainDraw(Graphics graphics) {
            int s = 20;
            int margin = 5;
            Random random = new Random();
            for (int i = s+margin; i < WIDTH-s-margin; i+=s) {
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                graphics.setColor(new Color(r, g, b));
                graphics.drawLine(margin,i,i,WIDTH-margin);
                graphics.setColor(new Color(r, g, b));
                graphics.drawLine(i,margin,WIDTH-margin,i);

            }
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

                this.setBackground(Color.BLACK);

                Graphics2D g2 = (Graphics2D) graphics;
                g2.setStroke(new BasicStroke(3));

            }
        }
    }

