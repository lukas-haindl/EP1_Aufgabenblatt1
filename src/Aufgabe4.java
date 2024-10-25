/*
    Aufgabe 4) CodeDraw Bibliothek und Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe4 {

    public static void main(String[] args) {

        int pixelWidth = 500;
        int pixelHeight = 500;
        CodeDraw myDrawObj = new CodeDraw(pixelWidth, pixelHeight);

        int numLinesQuadrant = 100;
        double startX, startY;
        myDrawObj.setCanvasPositionX(600);
        myDrawObj.setCanvasPositionX(100);

        for (int i = 1; i <= numLinesQuadrant; i++) {
            startX = i * (pixelWidth / 2.0 / numLinesQuadrant);
            startY = pixelHeight / 2.0 - ((i - 1) * (pixelHeight / 2.0 / numLinesQuadrant));
            //CYAN quadrant (top left)
            myDrawObj.setColor(Palette.CYAN);
            myDrawObj.drawLine(startX , 0, 0, startY);
            //TODO: Implement MAGENTA quadrant (bottom left) here
            myDrawObj.setColor(Palette.MAGENTA);
            myDrawObj.drawLine(startX , pixelHeight, 0, pixelHeight - startY);
            //TODO: Implement the GREEN quadrant (top right) here
            myDrawObj.setColor(Palette.GREEN);
            myDrawObj.drawLine(pixelWidth - startX, 0, pixelWidth, startY);
            //TODO: Implement the ORANGE quadrant (bottom right) here
            myDrawObj.setColor(Palette.ORANGE);
            myDrawObj.drawLine(pixelWidth - startX , pixelHeight, pixelWidth, pixelHeight - startY);
        }

        myDrawObj.setLineWidth(2);
        myDrawObj.setColor(Palette.BLACK);
        myDrawObj.drawLine(pixelWidth / 2.0, 0, pixelWidth / 2.0, pixelHeight);//vertical line
        myDrawObj.drawLine(0, pixelHeight / 2.0, pixelWidth, pixelHeight / 2.0);//horizontal line

        myDrawObj.show();
    }
}
