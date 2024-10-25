/*
    Aufgabe 3) Simulation mit verschachtelten Schleifen
*/

import codedraw.CodeDraw;
import codedraw.Palette;

public class Aufgabe3 {

    public static void main(String[] args) {

        int maxCap = 1500;
        int maxFoxes = 200;
        int maxRabbits = 2500;
        int dt = 1;
        double numRabbits = 2500;
        double numFoxes = 2;
        double freeCap = maxCap - numRabbits;
        double incRabbits, decFoxes, numContracts;
        for (int i = 1; i <= 500; i++) {
            System.out.format("Iteration: %d freeCap: %.2f numRabbits: %.2f numFoxes: %.2f%n", i, freeCap, numRabbits, numFoxes);
            System.out.println("*".repeat((int)Math.round(numRabbits * 500/maxRabbits)));
            System.out.println("#".repeat((int)Math.round(numFoxes * 500/maxFoxes)));
            freeCap = maxCap - numRabbits;
            incRabbits = (1.0 / maxCap) * freeCap * 0.08 * numRabbits;
            decFoxes = 0.2 * numFoxes;
            numContracts = numRabbits * numFoxes;
            numRabbits = numRabbits + dt * (incRabbits - 0.002 * numContracts);
            numFoxes = numFoxes + dt * (0.0004 * numContracts - decFoxes);
        }
    }
}
