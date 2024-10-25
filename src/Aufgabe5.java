/*
    Aufgabe 5) Schleifen und Zeichnen innerhalb des CodeDraw-Fensters
*/

import codedraw.CodeDraw;
import codedraw.Palette;

import java.awt.*;

public class Aufgabe5 {

    public static void main(String[] args) {

        int pixelWidth = 300;
        int pixelHeight = 300;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);
        int lineWidthBlue = 2;
        int lineWidthRed = 4;
        int n = 19;

        if (n >= 5 && n <= 19 && n % 2 != 0) {
            double sizeSquare = (double) pixelWidth / n;
            double posX = -sizeSquare;
            double posY = 0;
            myDrawObj.setColor(Color.RED);
            myDrawObj.setLineWidth(lineWidthRed);
            for (int line = 1; line <= n; line++) {
                double halfN = Math.round((double) n / 2);
                if (line == 1 || line == n) {
                    posX = -sizeSquare;
                    for (int row = 1; row <= n; row++) {
                        if (line == 1) {
                            if (row == n) {
                                myDrawObj.setColor(Color.BLUE);
                                myDrawObj.setLineWidth(lineWidthBlue);
                            }
                            posX += sizeSquare;
                            myDrawObj.drawSquare(posX, posY, sizeSquare);
                        } else if (line == n) {
                            posX += sizeSquare;
                            if (row == 1) {
                                myDrawObj.setColor(Color.BLUE);
                                myDrawObj.setLineWidth(lineWidthBlue);
                                myDrawObj.drawSquare(posX, posY, sizeSquare);
                            } else if (row <= halfN) {
                                myDrawObj.setColor(Color.RED);
                                myDrawObj.setLineWidth(lineWidthRed);
                                myDrawObj.drawSquare(posX, posY, sizeSquare);
                            }
                        }
                    }
                } else if (line <= halfN) {
                    myDrawObj.setColor(Color.BLUE);
                    myDrawObj.setLineWidth(lineWidthBlue);
                    posX -= sizeSquare;
                    myDrawObj.drawSquare(posX, posY, sizeSquare);
                } else {
                    myDrawObj.setColor(Color.RED);
                    myDrawObj.setLineWidth(lineWidthRed);
                    myDrawObj.drawSquare(posX, posY, sizeSquare);
                }
                posY += sizeSquare;
            }
            myDrawObj.show();
        } else {
            System.err.println("Variable n erfüllt die vorgegebenen Voraussetzungen (n darf nur ungerade Werte größer gleich 5 und kleiner gleich 19 annehmen) nicht!");
        }
    }
}
