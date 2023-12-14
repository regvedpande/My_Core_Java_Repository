package com.mkpits.loops;

public class ManDrawing {

    public static void main(String[] args) {
        drawMan();
        System.out.println("\nMATTHA GARAM");
    }

    public static void drawMan() {
        drawLine("   O   ");
        drawLine("  /|\\  ");
        drawLine("  / \\  ");
        drawLine("  / \\  ");
        drawLine(" /   \\ ");
        drawLine("/     \\");
    }

    public static void drawLine(String line) {
        System.out.println(line);
    }
}
