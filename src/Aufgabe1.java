/*
    Aufgabe 1) for-Schleifen
*/
public class Aufgabe1 {

    public static void main(String[] args) {
        //a)
        int sum = 0;
        for (int i = 21; i < 420; i++) {
            if (i % 21 == 0){
                sum += i;
            }
        }
        System.out.println(sum);
        //b)
        for (int i = 45; i <= 135; i++) {
            if ((i % 5 == 0) && (i % 9 != 0)){
                System.out.print(":" + i);
            }
        }
        System.out.println(":");
        //c)
        for (int i = 71 - 1; i > 51; i--) {
            if(i - 1 == 51){
                System.out.print((char)i);
            }
            System.out.print("," + (char) i);
        }
        System.out.println();
    }
}
