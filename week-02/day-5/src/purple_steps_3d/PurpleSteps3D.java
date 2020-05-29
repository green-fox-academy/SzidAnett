package purple_steps_3d;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class PurpleSteps3D {
    public static void mainDraw(Graphics graphics) {
        int width =10;
        int x = width;
        int max = 320/width;
        do {

            drawRect(x,width,graphics);
            x+=width;
            //width*=2;
            width+=10;

        } while (x+width<320*4/5);
    }

    public static void drawRect(int x, int width, Graphics graphics){

        graphics.setColor(Color.MAGENTA);
        graphics.fillRect(x,x,width,width);
        graphics.setColor(Color.BLACK);
        graphics.drawRect(x,x,width,width);
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
        }
    }
}

