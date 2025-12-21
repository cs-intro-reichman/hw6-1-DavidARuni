import java.awt.Color;

/**
 * Morphs a given image into its grayscaled version in n steps.
 *
 * Usage:
 *   java Editor4 <image.ppm> <n>
 *
 * Example:
 *   java Editor4 thor.ppm 50
 */
public class Editor4 {

    public static void main(String[] args) {

        // Optional but recommended:
        if (args.length != 2) {
            System.out.println("Usage: java Editor4 <image.ppm> <n>");
            return;
        }

        String filename = args[0];
        int n = Integer.parseInt(args[1]);

        // Read source image
        Color[][] source = Runigram.read(filename);

        // Create target: grayscaled version of the same image
        Color[][] target = Runigram.grayScaled(source);

        // Create canvas (same dimensions for both)
        Runigram.setCanvas(source);

        // Morph from colored to grayscale
        Runigram.morph(source, target, n);
    }
}