/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.gfx;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author KevinT
 */
public class SpriteSheet {

    public String path;
    public int width;
    public int height;
    public int[] pixels;

    public SpriteSheet(String path){
        BufferedImage image=null;
        try {
            image = ImageIO.read(SpriteSheet.class.getResourceAsStream(path));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        if(image==null)
        {
            return;
        }
        this.path = path;
        this.height = image.getHeight();
        this.width = image.getWidth();

        pixels = image.getRGB(0, 0, width, height, null, 0, width);

        for (int i = 0; i < pixels.length; i++) {
            pixels[i] = (pixels[i] & 0xff) / 64;
        }
        
        for (int i = 0; i < 8; i++) {
            System.out.println(pixels[i]);
        }
    }
}
