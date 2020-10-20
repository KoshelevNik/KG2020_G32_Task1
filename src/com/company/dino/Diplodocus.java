package com.company.dino;

import java.awt.*;

public class Diplodocus extends Dino {

    public Diplodocus(int dinoLength, int dinoHeight, int x, int y, Color color) {
        super(dinoLength, dinoHeight, x, y, color);
    }

    @Override
    public void head(Graphics g) {
        g.setColor(color);
        g.fillOval(0, dinoHeight / 12, dinoLength / 18, dinoHeight / 12);
        g.setColor(Color.BLACK);
        g.drawOval(0, dinoHeight / 12, dinoLength / 18, dinoHeight / 12);
        g.drawArc(-dinoLength / 36, 7 * dinoHeight / 72, dinoLength / 18, dinoHeight / 36, 0, -90);

        g.setColor(Color.WHITE);
        g.fillOval(dinoLength / 30, 5 * dinoHeight / 48, dinoLength / 75, dinoHeight / 75);
        g.setColor(Color.CYAN);
        g.fillOval(dinoLength / 25, 21 * dinoHeight / 192, dinoLength / 300, dinoHeight / 300);
        g.setColor(Color.BLACK);
        g.drawOval(dinoLength / 30, 5 * dinoHeight / 48, dinoLength / 75, dinoHeight / 75);
        g.drawOval(dinoLength / 25, 21 * dinoHeight / 192, dinoLength / 300, dinoHeight / 300);
    }

    @Override
    public void body(Graphics g) {
        g.setColor(color);
        g.fillArc(dinoLength / 3, 0, dinoLength / 3, 2 * dinoHeight / 15, 0, 180);
        g.fillArc(dinoLength / 3, 11 * dinoHeight / 60, dinoLength / 3, 2 * dinoHeight / 15, 0, -180);
        g.fillPolygon(
                new int[]{
                        dinoLength / 36,
                        dinoLength / 3,
                        2 * dinoLength / 3,
                        2 * dinoLength / 3,
                        dinoLength / 3,
                        dinoLength / 36
                },
                new int[]{
                        dinoHeight / 12,
                        dinoHeight / 15,
                        dinoHeight / 15,
                        dinoHeight / 4,
                        dinoHeight / 4,
                        dinoHeight / 6
                },
                6
        );
        g.setColor(Color.BLACK);
        g.drawLine(dinoLength / 36, dinoHeight / 12, dinoLength / 3, dinoHeight / 15);
        g.drawLine(dinoLength / 36, dinoHeight / 6, dinoLength / 3, dinoHeight / 4);
        g.drawArc(dinoLength / 3, 0, dinoLength / 3, 2 * dinoHeight / 15, 0, 180);
        g.drawArc(dinoLength / 3, 11 * dinoHeight / 60, dinoLength / 3, 2 * dinoHeight / 15, 0, -180);
    }

    @Override
    public void arms(Graphics g) {
        g.setColor(color);
        g.fillRect(dinoLength / 3, dinoHeight / 4, dinoLength / 15, 3 * dinoHeight / 4);
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        dinoLength / 3,
                        dinoLength / 3,
                        dinoLength / 3 + dinoLength / 15,
                        dinoLength / 3 + dinoLength / 15
                },
                new int[]{
                        dinoHeight / 4,
                        dinoHeight - 1,
                        dinoHeight - 1,
                        dinoHeight / 4
                },
                4
        );
        g.setColor(Color.WHITE);
        g.fillArc(dinoLength / 3, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.fillArc(16 * dinoLength / 45, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.fillArc(17 * dinoLength / 45, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(dinoLength / 3, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.drawArc(16 * dinoLength / 45, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.drawArc(17 * dinoLength / 45, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
    }

    @Override
    public void legs(Graphics g) {
        g.setColor(color);
        g.fillRect(2 * dinoLength / 3 - dinoLength / 15, dinoHeight / 4, dinoLength / 15, 3 * dinoHeight / 4);
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        2 * dinoLength / 3 - dinoLength / 15,
                        2 * dinoLength / 3 - dinoLength / 15,
                        2 * dinoLength / 3,
                        2 * dinoLength / 3
                },
                new int[]{
                        dinoHeight / 4,
                        dinoHeight - 1,
                        dinoHeight - 1,
                        dinoHeight / 4
                },
                4
        );
        g.setColor(Color.WHITE);
        g.fillArc(2 * dinoLength / 3 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.fillArc(31 * dinoLength / 45 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.fillArc(32 * dinoLength / 45 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(2 * dinoLength / 3 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.drawArc(31 * dinoLength / 45 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
        g.drawArc(32 * dinoLength / 45 - dinoLength / 15, 14 * dinoHeight / 15, dinoLength / 45, 2 * dinoHeight / 15, 0, 180);
    }

    @Override
    public void tail(Graphics g) {
        g.setColor(color);
        g.fillPolygon(
                new int[]{
                        2 * dinoLength / 3,
                        dinoLength,
                        2 * dinoLength / 3
                },
                new int[]{
                        dinoHeight / 15,
                        19 * dinoHeight / 120,
                        dinoHeight / 4
                },
                3
        );
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        2 * dinoLength / 3,
                        dinoLength,
                        2 * dinoLength / 3
                },
                new int[]{
                        dinoHeight / 15,
                        19 * dinoHeight / 120,
                        dinoHeight / 4
                },
                3
        );
    }
}
