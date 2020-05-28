package centered_square;
import javax.swing.*;
import java.awt.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
public class CenteredSquare {
    public static void mainDraw(Graphics graphics) {
        // Draw a green 10x10 square to the canvas' center.
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

            //graphics.setColor(Color.RED);
            //graphics.drawLine(0,160,320,160);

            //graphics.setColor(Color.RED);
            //graphics.drawLine(160,0,160,320);

            // top
            graphics.setColor(Color.GREEN);
            graphics.drawLine(155, 155, 165, 155);
            // right
            graphics.setColor(Color.GREEN);
            graphics.drawLine(165, 155, 165, 165);
            // bottom
            graphics.setColor(Color.GREEN);
            graphics.drawLine(155, 165, 165, 165);
            // left
            graphics.setColor(Color.GREEN);
            graphics.drawLine(155, 155, 155, 165);
        }
    }
}


