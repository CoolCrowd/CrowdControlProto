package edu.kit.ipd.crowdcontrol.objectservice.duplicateDetection;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * Created by lucaskrauss on 10.02.16.
 * @author lucaskrauss
 *
 * Calculates the similarity of two images.
 * For that each image is seperated in 25 sections and for each of them its color-signature is calculated.
 * The corresponding sections of the pictures are copared after that. Their similarity is based on the deviation of
 * the colorsignature of each section and thus based on location and color
 */
public class ImageSimilarity {

    final static double MAX_DISTANCE = Math.sqrt(3*(Math.pow(255,2)))*25;
    final static int BASE_SIZE = 300;
    final static int SAMPLE_SIZE = 60;


    /**
     * Identifies the similarity of the two given images.
     * Each image is divided in 25 sections, whose averaged color-values form the image-signature.
     * The similarity of the two images is based on the deviation of their color-value per image-section.
     *
     * @param image1
     * @param image2
     * @return
     */
    public static double identifyImageSimilarity(BufferedImage image1, BufferedImage image2) {

        Color[][] signatureImage1 = getImageSignature(image1);
        Color[][] signatureImage2 = getImageSignature(image2);

        //calc distance based on the difference of the RGB-values of the imageSignatures
        double distance = 0;
        for (int i = 0; i < signatureImage1.length; i++) {
            for (int j = 0; j < signatureImage1[i].length; j++) {
                double red = Math.pow(signatureImage1[i][j].getRed() - signatureImage2[i][j].getRed(), 2);
                double green = Math.pow(signatureImage1[i][j].getGreen() - signatureImage2[i][j].getGreen(), 2);
                double blue = Math.pow(signatureImage1[i][j].getBlue() - signatureImage2[i][j].getBlue(), 2);
                distance += Math.sqrt(red + green + blue);
            }
        }


        //Normalize distance
        return 1-(distance/MAX_DISTANCE);
    }

    /**
     * Calculates the image-signature of the given image.
     * The signature is presented as 25 samples of the image. The color-value of the sample is averaged.
     * This signature combines color-information with locality-information.
     * @param image whose signature is calculated
     * @return a two dimensional Color-array. Each entry Color[x][y] contains the color-value of the image-section
     * (x,y) to (x+1,y+1). The locality of the image-section is preserved.
     */
    private static Color[][] getImageSignature(BufferedImage image) {
        if (!(image.getHeight() == BASE_SIZE) && !(image.getWidth() == BASE_SIZE)) {
            image = rescale(image);
        }
        Color[][] imgSignature = new Color[5][5];
        for (int imgX = 0; imgX < imgSignature.length; imgX++) {
            for (int imgY = 0; imgY < imgSignature.length; imgY++) {
                imgSignature[imgX][imgY] = getAvg(image, imgX, imgY);
            }
        }
        return imgSignature;

    }

    /**
     * Calculates average color-signature of specified image-section
     *
     * @param image image to be processed
     * @param imgX x-coordinate of the beginning of the image-section
     * @param imgY y-coordinate of the beginning of the image-section
     * @return average color-signature of the image section
     */
    private static Color getAvg(BufferedImage image, int imgX, int imgY) {
        int[] colorBuffer = new int[3];
        for (int x = imgX * SAMPLE_SIZE; x < (imgX + 1) * SAMPLE_SIZE; x++) {
            for (int y = imgY * SAMPLE_SIZE; y < (imgY + 1) * SAMPLE_SIZE; y++) {
                //get color-values for pixel (x,y)
                Color c = new Color(image.getRGB(x,y));
                colorBuffer[0] += c.getRed();
                colorBuffer[1] += c.getGreen();
                colorBuffer[2] += c.getBlue();
            }
        }
        colorBuffer[0] /= SAMPLE_SIZE*SAMPLE_SIZE;
        colorBuffer[1] /= SAMPLE_SIZE*SAMPLE_SIZE;
        colorBuffer[2] /= SAMPLE_SIZE*SAMPLE_SIZE;

        return new Color(colorBuffer[0], colorBuffer[1], colorBuffer[2]);
    }

    /**
     * Scales Image to BASE_SIZE * BASE_SIZE
     *
     * @param oldImage
     * @return
     */
    private static BufferedImage rescale(BufferedImage oldImage) {

        BufferedImage newImage = new BufferedImage(BASE_SIZE, BASE_SIZE, BufferedImage.TYPE_INT_RGB);
        Graphics2D graphics = newImage.createGraphics();
        RenderingHints renderingHints = graphics.getRenderingHints();
        renderingHints.put(RenderingHints.KEY_INTERPOLATION,RenderingHints.VALUE_INTERPOLATION_NEAREST_NEIGHBOR);
        graphics.setRenderingHints(renderingHints);
        graphics.drawImage(oldImage,0,0,BASE_SIZE,BASE_SIZE,null);
        graphics.dispose();

        return newImage;

    }

}
