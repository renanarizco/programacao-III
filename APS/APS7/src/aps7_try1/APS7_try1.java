/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps7_try1;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author UNIFAFIBE
 */
public class APS7_try1 extends JPanel {

    ArrayList<Point> lstPoints;
    int px = 0;
    int py = 0;

    int base_px = 0;
    int base_py = 0;

    Random ran = new Random();
    int hx = ran.nextInt(320);
    int hy = ran.nextInt(520);
    
    int rx = ran.nextInt(320);
    int ry = ran.nextInt(520);
    
    boolean dragged = false;
    
    String texto;

    public APS7_try1() {
        lstPoints = new ArrayList<>();
        texto = "iniciando";

        this.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent me) {
                Point p = me.getPoint();
                System.out.println("Mouse Dragged: " + p);
                lstPoints.add(p);

                if (dragged) {

                    px = me.getX() - 25;
                    py = me.getY() - 25;

                }

                APS7_try1.this.repaint();
            }

            @Override
            public void mouseMoved(MouseEvent me) {

            }

        });

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent me) {
                if (((me.getX() >= rx - 50) && (me.getX() <= (rx + 50))) && ((me.getY() >= ry - 50) && (me.getY() <= (ry + 50)))) {

                   //JOptionPane.showMessageDialog(APS7_try1.this,"Pegou um anel !");
                   texto = "Pegou um anel !";

                    rx = ran.nextInt(320);
                    ry = ran.nextInt(520);

                }

                APS7_try1.this.repaint();

              
                
            }

            @Override
            public void mousePressed(MouseEvent me) {
                if (((me.getX() >= px) && (me.getX() <= (px + 50))) && ((me.getY() >= py) && (me.getY() <= (py + 50)))) {
                    dragged = true;
                }
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                dragged = false;

                //verifica
                if (((px >= hx - 50) && (px <= (hx + 50))) && ((py >= hy - 50) && (py <= (hy + 50)))) {
                    
                    JOptionPane.showMessageDialog(APS7_try1.this,"Sbagaçei o robotnik");

                    px = hx;
                    py = hy;

                    base_px = hx;
                    base_py = hy;

                    hx = ran.nextInt(320);
                    hy = ran.nextInt(520);

                } else {
                    //JOptionPane.showMessageDialog(APS7_try1.this,"Errei o robotnik");
                    
                    px = base_px;
                    py = base_py;

                }

                APS7_try1.this.repaint();

            }

            @Override
            public void mouseEntered(MouseEvent me) {
            }

            @Override
            public void mouseExited(MouseEvent me) {

            }
        });

    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        g.drawString(texto, 10, 10);
        
        BufferedImage img = null;
        try {
            img = ImageIO.read(new File("img/sh.png"));
        } catch (IOException ex) {
            Logger.getLogger(APS7_try1.class.getName()).log(Level.SEVERE, null, ex);
        }
        // g.drawImage(img,100, 100, 100, 100, this);

        BufferedImage img2 = null;
        try {
            img2 = ImageIO.read(new File("img/egg.png"));
        } catch (IOException ex) {
            Logger.getLogger(APS7_try1.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(img2, hx, hy, 50, 50, this);

        int[] xPoints = new int[lstPoints.size()];
        int[] yPoints = new int[lstPoints.size()];

        for (int i = 0; i < lstPoints.size(); i++) {
            Point p = lstPoints.get(i);
            xPoints[i] = p.x;
            yPoints[i] = p.y;
        }
        g.drawImage(img, px, py, 50, 50, this);
        
        
        BufferedImage img3 = null;
        try {
            img3 = ImageIO.read(new File("img/sr3.png"));
        } catch (IOException ex) {
            Logger.getLogger(APS7_try1.class.getName()).log(Level.SEVERE, null, ex);
        }
        g.drawImage(img3, rx, ry, 50, 50, this);
        

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        JFrame fr = new JFrame();
        fr.getContentPane().add(new APS7_try1());
        fr.setSize(400, 600);
        fr.setVisible(true);
        fr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }

}
