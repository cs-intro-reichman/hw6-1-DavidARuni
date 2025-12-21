import java.awt.Color;

/**
 * Demonstrates the scaling (resizing) operation featured by Runigram.java. 
 * The program recieves three command-line arguments: a string representing the name
 * of the PPM file of a source image, and two integers that specify the width and the
 * height of the scaled, output image. For example, to scale/resize ironman.ppm to a width
 * of 100 pixels and a height of 900 pixels, use: java Editor2 ironman.ppm 100 900
 */
public class Editor2 {

	public static void main (String[] args){
		// 1. Read command-line arguments
        String filename = args[0];
        int newWidth = Integer.parseInt(args[1]);
        int newHeight = Integer.parseInt(args[2]);

        // 2. Read source image
        Color[][] sourceImage = Runigram.read(filename);

        // 3. Create scaled image
        Color[][] scaledImage = Runigram.scaled(sourceImage, newWidth, newHeight);

        // 4. Display source image
        Runigram.setCanvas(sourceImage);
        Runigram.display(sourceImage);

        // Pause so we can see the original image
        StdDraw.pause(2000);

        // 5. Display scaled image on a NEW canvas
        Runigram.setCanvas(scaledImage);
        Runigram.display(scaledImage);			
	}
}
