import java.awt.Color;

public class SunsetEffect {
    public static void main(String[] args) {
        Picture picture = new Picture("image.jpg"); // Replace "image.jpg" with your file path
        picture.show();

        int width = picture.getWidth();
        int height = picture.getHeight();

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                Color color = picture.getPixelColor(x, y);

                int red = (int) (color.getRed() * 1.3);
                red = Math.min(red, 255);

                Color newColor = new Color(red, color.getGreen(), color.getBlue());
                picture.setPixelColor(x, y, newColor);
            }
        }

        picture.show(); // Display the modified image
    }
}
