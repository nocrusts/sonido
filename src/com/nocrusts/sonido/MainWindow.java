package com.nocrusts.sonido;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private JPanel MainPanel;
    private JSlider slider1;

    public MainWindow(String title) throws HeadlessException {
        super(title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(MainPanel);
        this.pack();
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("MainWindow");

        frame.setVisible(true);
    }
}
