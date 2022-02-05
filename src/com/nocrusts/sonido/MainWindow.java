package com.nocrusts.sonido;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {

    private JPanel MainPanel;
    private JSlider PosSlider;
    private JButton PlayPause;
    private JButton FileChooser;
    private JLabel RemTime;
    private JLabel ElpTime;

    public MainWindow() {

        FileChooser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        PlayPause.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
    }

    public static void main(String[] args) {
        //Java silver buttons suck, so let's use a native version.
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            //aware that this breaks if gnome is not in use, whatever.
        } catch (Exception e) {
            System.out.println("Failed to set L&F, skipping...");
        }

        JFrame frame = new JFrame("MainWindow");
        frame.setContentPane(new MainWindow().MainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }
}
