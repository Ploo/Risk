package com.pucilowski.risk;

import com.pucilowski.risk.game.Risk;
import com.pucilowski.risk.gui.Frame;

/**
 * Created by martin on 08/01/14.
 */
public class Main {

    public static void main(String[] args) {

        Risk risk = new Risk();

        Frame frame = new Frame(risk);

    }

}
