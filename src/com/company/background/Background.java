package com.company.background;

import javax.swing.*;
import java.awt.*;

public class Background extends JComponent {
    private final int width, height;

    public Background(int width, int height, int x, int y) {
        this.width = width;
        this.height = height;
        setSize(width, height);
        setLocation(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(50, 150, 255));
        g.fillRect(0, 0, width, height - 200);
        g.setColor(new Color(100, 255, 50));
        g.fillRect(0, height - 200, width, 200);
    }
}
