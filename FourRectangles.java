package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

    public class FourRectangles {

        public static void mainDraw(Graphics graphics){
            // draw four different size and color rectangles.
            // avoid code duplication.


            graphics.setColor(Color.red);
            graphics.drawRect(120, 120, 30,30);
            graphics.setColor(Color.green);
            graphics.drawRect(100, 100, 75, 110);
            graphics.setColor(Color.yellow);
            graphics.drawRect(220, 220, 160, 160);
            graphics.setColor(Color.blue);
            graphics.drawRect(300,300, 220, 200);


        }

        // Don't touch the code below
        static int WIDTH = 320;
        static int HEIGHT = 320;

        public static void main(String[] args) {
            JFrame jFrame = new JFrame("Drawing");
            jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
            ImagePanel panel = new ImagePanel();
            panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
            jFrame.add(panel);
            jFrame.setLocationRelativeTo(null);
            jFrame.setVisible(true);
            jFrame.pack();
        }

        static class ImagePanel extends JPanel {
            @Override
            protected void paintComponent(Graphics graphics) {
                super.paintComponent(graphics);
                mainDraw(graphics);
            }
        }
    }

