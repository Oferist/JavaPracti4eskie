package pr8_z2;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageDisplay extends JFrame {

    public ImageDisplay(String imagePath) {
        setTitle("Image Display");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 400);
        setLocationRelativeTo(null);

        try {
            BufferedImage image = ImageIO.read(new File(imagePath));
            JLabel label = new JLabel(new ImageIcon(image));
            add(label, BorderLayout.CENTER);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error loading image", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Необходимо прописать путь к изображению (Нажмите на свой класс где вы компилируете -> Run as -> Run configurations -> arguments -> programm arguments -> прописываете свой путь к изображению");
            System.exit(1);
        }

        SwingUtilities.invokeLater(() -> {
            ImageDisplay imageDisplay = new ImageDisplay(args[0]);
            imageDisplay.setVisible(true);
        });
    }
}
