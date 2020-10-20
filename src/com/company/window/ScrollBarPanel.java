package com.company.window;

import javax.swing.*;
import java.awt.*;

public class ScrollBarPanel extends JPanel {
    private int width;
    private int height;

    private final JScrollBar horizontalBar;
    private final JScrollBar verticalBar;

    public int width() {
        return width;
    }

    public int height() {
        return height;
    }

    public ScrollBarPanel(int width, int height) {
        this.width = width;
        this.height = height;

        setLayout(null);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        horizontalBar = new JScrollBar(Adjustable.HORIZONTAL, 0, dimension.width, 0, width);
        add(horizontalBar);
        horizontalBar.setSize(dimension.width - 20, 20);
        horizontalBar.setLocation(0, dimension.height - 20);

        verticalBar = new JScrollBar(Adjustable.VERTICAL, 0, dimension.height, 0, height);
        add(verticalBar);
        verticalBar.setSize(20, dimension.height - 20);
        verticalBar.setLocation(dimension.width - 20, 0);

        verticalBar.addAdjustmentListener(new ScrollBarListener(this, true));
        horizontalBar.addAdjustmentListener(new ScrollBarListener(this, false));
    }

    public void addNewElement(JComponent component) {
        add(component);
        if (Math.abs(component.getY()) + component.getHeight() > height) {
            height = Math.abs(component.getY()) + component.getHeight();
            verticalBar.setMaximum(height);
        }
        if (component.getX() + component.getWidth() > width) {
            width = component.getX() + component.getWidth();
            horizontalBar.setMaximum(width);
        }
    }
}
