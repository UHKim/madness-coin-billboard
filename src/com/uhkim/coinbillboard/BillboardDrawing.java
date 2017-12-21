package com.uhkim.coinbillboard;

import processing.core.PApplet;

public class BillboardDrawing extends PApplet {
    public void settings() {
        size(300, 300);
    }

    public void setup() {
        fill(120, 50, 240);
    }

    public void draw() {
        ellipse(width / 2, height / 2, second(), second());
    }

}
