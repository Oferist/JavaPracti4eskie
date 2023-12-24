package pr8_z1;

import javax.swing.*;

import java.awt.*;
import java.util.Random;

public class Drawing extends JFrame {
    private static final int WINDOW_WIDTH = 800;
    private static final int WINDOW_HEIGHT = 600;

    private final Shape[] shapes;

    public Drawing() {
        setTitle("Random Shapes");
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        shapes = new Shape[20];
        generateRandomShapes();
    }

    private void generateRandomShapes() {
        Random rand = new Random();

        for (int i = 0; i < shapes.length; i++) {
            int x = rand.nextInt(WINDOW_WIDTH);
            int y = rand.nextInt(WINDOW_HEIGHT);
            Color color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));

            // Генерация случайной фигуры (например, круга)
            int radius = rand.nextInt(50) + 20;
            shapes[i] = new Circle(color, x, y, radius);
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        for (Shape shape : shapes) {
            shape.draw(g);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Drawing window = new Drawing();
            window.setVisible(true);
        });
    }
}
