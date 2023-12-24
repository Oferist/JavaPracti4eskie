package pr8_z3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimationWindow extends JFrame {

    private ImageIcon[] frames;
    private int currentFrameIndex;

    public AnimationWindow() {
        setTitle("Animation Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Загружаем кадры анимации (замените пути к файлам на ваши)
        frames = new ImageIcon[3];
        frames[0] = new ImageIcon("D:/imagesforJava/pr8.jpg");
        frames[1] = new ImageIcon("D:/imagesforJava/pr8_1.jpg");
        frames[2] = new ImageIcon("D:/imagesforJava/pr8_2.jpg");

        currentFrameIndex = 0;

        // Устанавливаем таймер для обновления анимации
        Timer timer = new Timer(1600, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                updateAnimation();
                repaint();
            }
        });
        timer.start();
    }

    private void updateAnimation() {
        currentFrameIndex = (currentFrameIndex + 1) % frames.length;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Отрисовываем текущий кадр анимации
        if (frames[currentFrameIndex] != null) {
            g.drawImage(frames[currentFrameIndex].getImage(), 50, 50, null);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            AnimationWindow window = new AnimationWindow();
            window.setVisible(true);
        });
    }
}
