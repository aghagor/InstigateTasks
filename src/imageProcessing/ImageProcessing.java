package imageProcessing;

import javax.imageio.ImageIO;
import java.awt.Graphics;
import java.awt.Font;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageProcessing {
    public static final String RESOURCE_PATH = "src\\resources\\";
    public static final String MIRRORED_FILE_NAME = "mirroredFile";
    public static final String WATERMARKED_FILE_NAME = "watermarkedFile";
    public static final String GRAYSCALED_FILE_NAME = "grayscaledFile";

    public static void main(String[] args) {

        String fileName = "1.jpg";
        File file = new File(RESOURCE_PATH + fileName);
        ImageProcessing imageProcessing = new ImageProcessing();
        BufferedImage image = imageProcessing.grayscaleImage(file);
        image = imageProcessing.mirrorImage(file);
        image = imageProcessing.watermarkImage(file);
        imageProcessing.saveImage(image, WATERMARKED_FILE_NAME, "jpg");

    }


    public BufferedImage grayscaleImage(File file) {
        BufferedImage img = null;
        File f;

        try {
            f = file;
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        int width = img.getWidth();
        int height = img.getHeight();

        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                int p = img.getRGB(x, y);

                int a = (p >> 24) & 0xff;
                int r = (p >> 16) & 0xff;
                int g = (p >> 8) & 0xff;
                int b = p & 0xff;

                int avg = (r + g + b) / 3;

                p = (a << 24) | (avg << 16) | (avg << 8) | avg;

                img.setRGB(x, y, p);
            }
        }
        return img;
    }

    public BufferedImage mirrorImage(File file) {
        BufferedImage image = null;

        File f;

        try {
            f = file;
            image = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }

        int width = image.getWidth();
        int height = image.getHeight();

        BufferedImage mimg = new BufferedImage(width, height,
                BufferedImage.TYPE_INT_ARGB);

        for (int y = 0; y < height; y++) {
            for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) {
                int p = image.getRGB(lx, y);
//                System.out.println(p);
                mimg.setRGB(rx, y, p);
            }
        }

        return mimg;
    }

    public BufferedImage watermarkImage(File file) {
        BufferedImage img = null;
        File f;

        // Read image
        try {
            f = file;
            img = ImageIO.read(f);
        } catch (IOException e) {
            System.out.println(e);
        }

        BufferedImage temp = new BufferedImage(img.getWidth(),
                img.getHeight(), BufferedImage.TYPE_INT_RGB);

        Graphics graphics = temp.getGraphics();
        graphics.drawImage(img, 0, 0, null);

        graphics.setFont(new Font("Arial", Font.PLAIN, 180));
        graphics.setColor(new Color(80, 78, 78, 40));

        String watermark = "Aghagor";

        graphics.drawString(watermark, img.getWidth() / 4,
                img.getHeight() / 2);
        graphics.dispose();

        return temp;
    }

    private void saveImage(BufferedImage image, String fileName, String fileExtension) {
        try {
            File f = new File(RESOURCE_PATH + fileName + "." + fileExtension);
            ImageIO.write(image, "png", f);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}
