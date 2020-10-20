package com.company.dino;

import javax.swing.*;
import java.awt.*;

public abstract class Dino extends JComponent {
    protected final int dinoLength;
    protected final int dinoHeight;

    protected final Color color;

    public Dino(int dinoLength, int dinoHeight, int x, int y, Color color) {
        this.dinoLength = dinoLength;
        this.dinoHeight = dinoHeight;
        this.color = color;
        setLocation(x, y);
        setSize(dinoLength, dinoHeight);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        body(g);
        legs(g);
        arms(g);
        tail(g);
        head(g);
    }

    public abstract void head(Graphics g);

    public abstract void body(Graphics g);

    public abstract void legs(Graphics g);

    public abstract void arms(Graphics g);

    public abstract void tail(Graphics g);
}
