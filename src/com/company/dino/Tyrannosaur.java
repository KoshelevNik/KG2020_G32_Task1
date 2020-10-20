package com.company.dino;

import java.awt.*;

public class Tyrannosaur extends Dino {
    private final int teethCount;
    private final int teethLength;

    public Tyrannosaur(int dinoLength, int dinoHeight, int x, int y, int teethCount, int teethLength, Color color) {
        super(dinoLength, dinoHeight, x, y, color);
        this.teethCount = teethCount;
        this.teethLength = teethLength;
    }

    @Override
    public void head(Graphics g) {
        int headLength = dinoLength / 6;
        int headHeight = dinoHeight / 8;
        int jawLength = headLength * 2 / 3;

        g.setColor(color);
        g.fillArc(0, 0, 2 * jawLength, headHeight, 90, 180);
        g.setColor(Color.BLACK);
        g.drawArc(0, 0, 2 * jawLength, headHeight, 90, 180);

        g.setColor(color);
        g.fillArc(jawLength / 2, 0, jawLength, headHeight, -90, 180);
        g.setColor(Color.BLACK);
        g.drawArc(jawLength / 2, 0, jawLength, headHeight, -90, 180);

        g.setColor(Color.WHITE);
        g.fillOval(5 * headLength / 6 - 5, headHeight / 4 - 5, 15, 15);
        g.setColor(Color.BLACK);
        g.drawOval(5 * headLength / 6 - 5, headHeight / 4 - 5, 15, 15);
        g.setColor(new Color(55, 255, 60));
        g.fillOval(5 * headLength / 6, headHeight / 4, 3, 3);
        g.setColor(Color.BLACK);
        g.drawOval(5 * headLength / 6, headHeight / 4, 3, 3);

        g.drawOval(headLength / 10, 3 * headHeight / 8, 3, 3);

        for (int i = 0; i < teethCount; i++) {
            g.setColor(Color.WHITE);
            g.fillPolygon(
                    new int[]{
                            i * jawLength * 4 / 5 / teethCount,
                            (int) ((i + 0.5) * jawLength * 4 / 5 / teethCount),
                            (i + 1) * jawLength * 4 / 5 / teethCount
                    },
                    new int[]{
                            headHeight / 2,
                            headHeight / 2 + teethLength,
                            headHeight / 2
                    },
                    3
            );
            g.setColor(Color.BLACK);
            g.drawPolyline(
                    new int[]{
                            i * jawLength * 4 / 5 / teethCount,
                            (int) ((i + 0.5) * jawLength * 4 / 5 / teethCount),
                            (i + 1) * jawLength * 4 / 5 / teethCount
                    },
                    new int[]{
                            headHeight / 2,
                            headHeight / 2 + teethLength,
                            headHeight / 2
                    },
                    3
            );
        }

        g.drawLine(0, headHeight / 2, jawLength, headHeight / 2);
    }

    @Override
    public void body(Graphics g) {
        g.setColor(color);
        g.fillArc(0, 0, 2 * dinoLength / 9, 3 * dinoHeight / 8, 0, 90);
        g.setColor(Color.BLACK);
        g.drawArc(0, 0, 2 * dinoLength / 9, 3 * dinoHeight / 8, 0, 90);
        g.setColor(color);
        g.fillArc(dinoLength / 12, -dinoHeight / 16, dinoLength / 18, 3 * dinoHeight / 8, 180, 90);
        g.setColor(Color.BLACK);
        g.drawArc(dinoLength / 12, -dinoHeight / 16, dinoLength / 18, 3 * dinoHeight / 8, 180, 90);

        g.setColor(color);
        g.fillArc(2 * dinoLength / 9, dinoHeight / 8, dinoLength / 3, dinoHeight / 8, 0, 180);
        g.setColor(Color.BLACK);
        g.drawArc(2 * dinoLength / 9, dinoHeight / 8, dinoLength / 3, dinoHeight / 8, 0, 180);
        g.setColor(color);
        g.fillArc(dinoLength / 9, 3 * dinoHeight / 16, 4 * dinoLength / 9, dinoHeight / 4, 180, 180);
        g.setColor(Color.BLACK);
        g.drawArc(dinoLength / 9, 3 * dinoHeight / 16, 4 * dinoLength / 9, dinoHeight / 4, 180, 180);
        g.setColor(color);

        g.fillRect(4 * dinoLength / 36, 3 * dinoHeight / 16, 4 * dinoLength / 9 + 1, dinoHeight / 8);
    }

    @Override
    public void legs(Graphics g) {
        g.setColor(color);
        g.fillPolygon(
                new int[]{
                        dinoLength / 2,
                        4 * dinoLength / 9,
                        19 * dinoLength / 36,
                        17 * dinoLength / 36,
                        17 * dinoLength / 36,
                        4 * dinoLength / 9,
                        4 * dinoLength / 9,

                        4 * dinoLength / 9,
                        17 * dinoLength / 36,
                        13 * dinoLength / 36,
                        3 * dinoLength / 9
                },
                new int[]{
                        dinoHeight / 4,
                        5 * dinoHeight / 8,
                        7 * dinoHeight / 8,
                        15 * dinoHeight / 16,
                        dinoHeight,
                        dinoHeight,
                        15 * dinoHeight / 16,

                        15 * dinoHeight / 16,
                        7 * dinoHeight / 8,
                        5 * dinoHeight / 8,
                        dinoHeight / 4
                },
                11
        );
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        dinoLength / 2,
                        4 * dinoLength / 9,
                        19 * dinoLength / 36,
                        17 * dinoLength / 36,
                        17 * dinoLength / 36,
                        4 * dinoLength / 9,
                        4 * dinoLength / 9,

                        4 * dinoLength / 9,
                        17 * dinoLength / 36,
                        13 * dinoLength / 36,
                        3 * dinoLength / 9
                },
                new int[]{
                        dinoHeight / 4,
                        5 * dinoHeight / 8,
                        7 * dinoHeight / 8,
                        15 * dinoHeight / 16,
                        dinoHeight,
                        dinoHeight,
                        15 * dinoHeight / 16,

                        15 * dinoHeight / 16,
                        7 * dinoHeight / 8,
                        5 * dinoHeight / 8,
                        dinoHeight / 4
                },
                11
        );
        g.setColor(Color.WHITE);
        g.fillPolygon(
                new int[]{
                        4 * dinoLength / 9,
                        5 * dinoLength / 12,
                        4 * dinoLength / 9
                },
                new int[]{
                        dinoHeight,
                        dinoHeight,
                        15 * dinoHeight / 16
                },
                3
        );
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        4 * dinoLength / 9,
                        5 * dinoLength / 12,
                        4 * dinoLength / 9
                },
                new int[]{
                        dinoHeight,
                        dinoHeight,
                        15 * dinoHeight / 16
                },
                3
        );
    }

    @Override
    public void arms(Graphics g) {
        g.setColor(Color.WHITE);
        g.fillPolygon(
                new int[]{
                        7 * dinoLength / 36,
                        11 * dinoLength / 72,
                        13 * dinoLength / 72,
                        5 * dinoLength / 32,
                        dinoLength / 6
                },
                new int[]{
                        11 * dinoHeight / 16,
                        43 * dinoHeight / 64,
                        21 * dinoHeight / 32,
                        41 * dinoHeight / 64,
                        5 * dinoHeight / 8
                },
                5
        );
        g.setColor(color);
        g.fillPolygon(
                new int[]{
                        2 * dinoLength / 9,
                        dinoLength / 4,
                        2 * dinoLength / 9,
                        7 * dinoLength / 36,
                        dinoLength / 6,
                        5 * dinoLength / 24,
                        2 * dinoLength / 9,
                        dinoLength / 6
                },
                new int[]{
                        3 * dinoHeight / 8,
                        dinoHeight / 2,
                        5 * dinoHeight / 8,
                        11 * dinoHeight / 16,
                        5 * dinoHeight / 8,
                        19 * dinoHeight / 32,
                        dinoHeight / 2,
                        5 * dinoHeight / 16
                },
                8
        );
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        2 * dinoLength / 9,
                        dinoLength / 4,
                        2 * dinoLength / 9,
                        7 * dinoLength / 36,//4
                        dinoLength / 6,
                        5 * dinoLength / 24,
                        2 * dinoLength / 9,
                        dinoLength / 6
                },
                new int[]{
                        3 * dinoHeight / 8,
                        dinoHeight / 2,
                        5 * dinoHeight / 8,
                        11 * dinoHeight / 16,//4
                        5 * dinoHeight / 8,
                        19 * dinoHeight / 32,
                        dinoHeight / 2,
                        5 * dinoHeight / 16
                },
                8
        );
        g.drawPolyline(
                new int[]{
                        7 * dinoLength / 36,
                        11 * dinoLength / 72,
                        13 * dinoLength / 72,
                        5 * dinoLength / 32,
                        dinoLength / 6
                },
                new int[]{
                        11 * dinoHeight / 16,
                        43 * dinoHeight / 64,
                        21 * dinoHeight / 32,
                        41 * dinoHeight / 64,
                        5 * dinoHeight / 8
                },
                5
        );
    }

    @Override
    public void tail(Graphics g) {
        g.setColor(color);
        g.fillPolygon(
                new int[]{
                        5 * dinoLength / 9,
                        dinoLength,
                        5 * dinoLength / 9
                },
                new int[]{
                        3 * dinoHeight / 16,
                        dinoHeight / 4,
                        5 * dinoHeight / 16
                },
                3
        );
        g.setColor(Color.BLACK);
        g.drawPolyline(
                new int[]{
                        5 * dinoLength / 9,
                        dinoLength,
                        5 * dinoLength / 9
                },
                new int[]{
                        3 * dinoHeight / 16,
                        dinoHeight / 4,
                        5 * dinoHeight / 16
                },
                3
        );
    }
}
