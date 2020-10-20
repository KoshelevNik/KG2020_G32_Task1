package com.company.window;

import javax.swing.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class ScrollBarListener implements AdjustmentListener {
    private final JPanel panel;
    private final boolean isVertical;
    private int lastValue = 0;

    public ScrollBarListener(JPanel panel, boolean isVertical) {
        this.panel = panel;
        this.isVertical = isVertical;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        for (int i = 0; i < panel.getComponentCount(); i++) {
            if (!(panel.getComponents()[i] instanceof JScrollBar)) {
                panel.getComponents()[i].setLocation(
                        (!isVertical) ?
                                panel.getComponents()[i].getX() - e.getValue() + lastValue :
                                panel.getComponents()[i].getX(),
                        (isVertical) ?
                                panel.getComponents()[i].getY() - e.getValue() + lastValue :
                                panel.getComponents()[i].getY()
                );
            }
        }
        lastValue = e.getValue();
    }
}
