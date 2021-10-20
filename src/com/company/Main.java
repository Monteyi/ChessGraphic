package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    JFrame frame;
    JButton squares[][] = new JButton[8][8];
    private Color colorGreen = Color.green;


    public Main() {
        frame = new JFrame("Play Chess!!!");
        frame.setSize(800, 800);
        frame.setLayout(new GridLayout(8, 8));

        // Menu bar
        JMenuBar menu = new JMenuBar();
        JMenu menu1 = new JMenu("New game");
        menu.add(menu1);
        JMenu menu2 = new JMenu("Resign");
        menu.add(menu2);
        frame.setJMenuBar(menu);

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JButton();

                if ((i + j) % 2 != 0) {
                    squares[i][j].setBackground(colorGreen);
                }
                frame.add(squares[i][j]);
            }
        }

        // image for pawns
        for (int i = 0; i < 8; i++) {
            squares[1][i].add(new JButton(new ImageIcon(getClass().getResource("BPawn.png"))));
            squares[6][i].add(new JButton(new ImageIcon(getClass().getResource("WPawn.png"))));
        }

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.validate();
        frame.setLocationRelativeTo(null);

    }

    public static void main(String[] args) {
        new Main();
    }
}