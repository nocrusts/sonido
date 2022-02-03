package com.nocrusts.sonido;

import javax.swing.*;

public class MainWindow {

    private JSlider slider1;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JPanel MainPanel;

    public static void main(String[] args) {
        System.out.println("Started");
        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
