package purple_steps;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class PurpleSteps {
    public static void mainDraw(Graphics graphics) {
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

            //Graphics2D g2 = (Graphics2D) graphics;
            //g2.setStroke(new BasicStroke(3));

            int width =10;
            int max = 320/width;
            for (int i = 1; i < max/3*2; i++) {

                int x = i*width;

                drawRect(x,width,graphics);

            }
        }

        public static void drawRect(int x, int width, Graphics graphics){

            graphics.setColor(Color.MAGENTA);
            graphics.fillRect(x,x,width,width);
            graphics.setColor(Color.BLACK);
            graphics.drawRect(x,x,width,width);
        }
            }
        }




