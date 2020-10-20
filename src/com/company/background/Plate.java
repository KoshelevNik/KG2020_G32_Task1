package com.company.background;

import javax.swing.*;
import java.awt.*;

public class Plate extends JComponent {
    private final int size;
    private final int width;
    private final int height;
    private final String text;

    public Plate(int width, int height, int x, int y, String text, int size) {
        this.width = width;
        this.height = height;
        this.text = text;
        this.size = size;
        setSize(width, height);
        setLocation(x, y);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(new Color(200, 150, 100));
        g.fillRect(0, 0, width, height / 2);
        g.fillRect(4 * width / 9, height / 2, width / 9, height / 2);
        g.setColor(Color.BLACK);
        g.drawRect(0, 0, width - 1, height / 2);
        g.drawRect(4 * width / 9, height / 2, width / 9, height / 2 - 1);
        g.setFont(new Font("lol", Font.BOLD, size));
        g.drawString(text, (width - text.length() * size) / 2, g.getFont().getSize());
    }
}
