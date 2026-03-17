import java.awt.*;
import javax.swing.*;

class Hello2DAppSimples {
    public static void main (String[] args) {
        new Hello2DFrameSimples();
    }
}

class Hello2DFrameSimples extends JFrame {
    public Hello2DFrameSimples () {
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Java2D - Jogo da Velha");
        this.setSize(400, 400);
        this.setVisible(true);
    }

    @Override
    public void paint (Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        int w = getWidth();
        int h = getHeight();

        g2d.setColor(Color.BLACK);
        g2d.setStroke(new BasicStroke(5.0f));

        g2d.drawLine(w/3, 50, w/3, h - 50);
        g2d.drawLine(2*w/3, 50, 2*w/3, h - 50);

        g2d.drawLine(50, h/3, w - 50, h/3);
        g2d.drawLine(50, 2*h/3, w - 50, 2*h/3);

        g2d.setColor(Color.RED);
        g2d.setStroke(new BasicStroke(8.0f));

        int xInicio = w/3 + 30;
        int yInicio = h/3 + 30;
        int xFim = 2*w/3 - 30;
        int yFim = 2*h/3 - 30;

        g2d.drawLine(xInicio, yInicio, xFim, yFim);
        g2d.drawLine(xFim, yInicio, xInicio, yFim);
    }
}
