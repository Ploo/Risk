package com.pucilowski.risk.gui;

import com.pucilowski.risk.game.map.Map;

import javax.swing.*;
import java.awt.*;

/**
 * Created by martin on 08/01/14.
 */
public class GamePanel extends JPanel {

    Map map;

    public GamePanel(Map map) {
        this.map=map;
    }

    @Override
    protected void paintComponent(Graphics g) {

    }



}
