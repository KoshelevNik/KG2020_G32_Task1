package com.company.window;

import com.company.background.Background;
import com.company.background.Plate;
import com.company.dino.Diplodocus;
import com.company.dino.Tyrannosaur;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setUndecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(400, 400);
        setExtendedState(MAXIMIZED_BOTH);

        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();

        ScrollBarPanel panel = new ScrollBarPanel(dimension.width, dimension.height);
        add(panel);

        panel.addNewElement(new Diplodocus(1000, 500, 10, 7510, Color.RED));
        panel.addNewElement(new Tyrannosaur(1500, 800, 10,7210, 10, 10, Color.BLUE));
        panel.addNewElement(new Plate(200, 100, 10, 7910, "Братишки", 12));
        panel.addNewElement(new Tyrannosaur(750, 400, 1600, 7610, 20, 5, Color.YELLOW));
        panel.addNewElement(new Tyrannosaur(375, 200, 1000,7810,5,10,Color.MAGENTA));
        panel.addNewElement(new Plate(100,50,1500,7960, "Шкеты", 10));
        panel.addNewElement(new Diplodocus(3000,1000,2000,7010,Color.GREEN));
        panel.addNewElement(new Tyrannosaur(15000,8000,5000,10,50,20,Color.WHITE));
        panel.addNewElement(new Plate(400,200,8000,7810,"Здоровяк",14));

        panel.add(new Background(panel.width(), panel.height(), 0, 0));

        setVisible(true);
    }
}
