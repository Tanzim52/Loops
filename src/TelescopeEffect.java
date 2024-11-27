import java.awt.Color;

public class TelescopeEffect {
    public static void main(String[] args) {
        Picture picture = new Picture("image.jpg"); // Replace "image.jpg" with your file path
        picture.show();

        int width = picture.getWidth();
        int height = picture.getHeight();
        int centerX = width / 2;
        int centerY = height / 2;

        int radius = Math.min(width, height) / 3; // Set the circle radius

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                int dx = x - centerX;
                int dy = y - centerY;

                if (dx * dx + dy * dy > radius * radius) {
                    picture.setPixelColor(x, y, Color.BLACK);
                }
            }
        }

        picture.show(); // Display the modified image
    }
}
