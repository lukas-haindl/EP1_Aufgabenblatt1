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
        for (int i = 71 - 1; i >= 51; i--) {
            if(i == 71 - 1){
                System.out.print((char)i);
            }else{
                System.out.print("," + (char) i);
            }
        }
        System.out.println();
        //d)
        String line = "Zehn zahme Ziegen zogen ziemlich z¨ugig zehn Zentner Zucker zum Zoo!";
        int counter = 0;
        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'Z' || line.charAt(i) == 'z'){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
