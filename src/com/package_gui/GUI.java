package com.package_gui;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GUI extends Frame {
    public GUI(String title) {
        super(title);
        setSize(500,300);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Font f = new Font("SansSerifff", Font.BOLD, 18);
        g.setFont(f);
        g.drawString("JAVA", 250, 150);

    }
}
