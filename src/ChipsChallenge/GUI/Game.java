/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ChipsChallenge.GUI;

import ChipsChallenge.gfx.SpriteSheet;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author KevinT
 */
public class Game extends Canvas implements Runnable {

    private static final long VersionID = 1L;
    private static final int WIDTH = 160;
    private static final int HEIGHT = WIDTH / 12 * 9;
    private static final int SCALE = 3;
    private static final String NAME = "Budi's Challenge";

    private JFrame frame;

    public boolean running = false;
    public int tickCt;
    
    private BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    private int[] pixels = ((DataBufferInt)image.getRaster().getDataBuffer()).getData();

    private SpriteSheet sheet;
    public Game(){
        this.sheet = new SpriteSheet("\\SpriteShit.png");
        setMinimumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setMaximumSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));

        frame = new JFrame(NAME);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        frame.add(this, BorderLayout.CENTER);
        frame.pack();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public synchronized void start() {
        this.running = true;
        new Thread(this).start();
    }

    public synchronized void stop() {
        this.running = false;
    }

    public void run() {
        long lastTime = System.nanoTime();
        double nanoSecPerTick = 1000000000D / 60D;

        int frames = 0;
        int ticks = 0;

        long lastTimer = System.currentTimeMillis();
        double delta = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nanoSecPerTick;
            lastTime = now;
            boolean shouldRender = true;
            while (delta >= 1) {
                ticks++;
                tick();
                delta -= 1;
                shouldRender = true;
            }
            try {
                Thread.sleep(12);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            if (shouldRender) {
                frames++;
                render();
            }

            if (System.currentTimeMillis() - lastTimer > 1000) {
                lastTimer += 1000;
                System.out.println("framse" + ":" + frames + " , " + "ticks" + ":" + ticks);
                frames = 0;
                ticks = 0;
            }
        }
    }

    public void tick() {
        this.tickCt++;
        
        for (int i = 0; i < pixels.length; i++) {
            pixels[i]=i+tickCt;
        }
    }

    public void render() {
        BufferStrategy bs = getBufferStrategy();
        if(bs == null)
        {
            createBufferStrategy(3);
            return;
        }
        Graphics g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, getWidth(),getHeight(),null);
        g.dispose();
        bs.show();
    }

    public static void main(String[] args){
        new Game().start();
    }

}
