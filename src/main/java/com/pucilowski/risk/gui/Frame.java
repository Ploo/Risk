package com.pucilowski.risk.gui;

import com.pucilowski.risk.game.Risk;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 08/01/14.
 */
public class Frame extends JFrame {

    Risk risk;
    GamePanel gamePanel;

    public Frame(Risk risk) {
        this.risk = risk;
        gamePanel = new GamePanel(risk.map);

        setLayout(new BorderLayout());
        add(gamePanel, BorderLayout.CENTER);

        setSize(800, 600);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);


    }


}
