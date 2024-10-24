/*
    Aufgabe 2) while-Schleifen
*/
public class Aufgabe2 {

    public static void main(String[] args) {

        String text1 = "Eine nennenswerte und geeignete Sprache.";
        String text = "Anzahl der Zeichen ist nicht genug!";
        int length = text.length();
        int i = 0;

        while (i < length) {
            if (text.charAt(i) == 'A' ||
                    text.charAt(i) == 'a' ||
                    text.charAt(i) == 'E' ||
                    text.charAt(i) == 'e' ||
                    text.charAt(i) == 'I' ||
                    text.charAt(i) == 'i' ||
                    text.charAt(i) == 'O' ||
                    text.charAt(i) == 'o' ||
                    text.charAt(i) == 'U' ||
                    text.charAt(i) == 'u'
            ) {
                System.out.print("-" + text.charAt(i));
            }else{
                System.out.print(text.charAt(i));
            }
            i++;
        }
        System.out.println();
        i = 0;
        String output = "";
        while (i < length) {
            if (!((text.charAt(i) > 96 && text.charAt(i) < 107) || (text.charAt(i) > 64 && text.charAt(i) < 75) || (text.charAt(i) == 32))) {
                output += text.charAt(i);
            }
            i++;
        }
        System.out.println(output);

        int k = 35;
        while (k < 175){
            if (k % 5 == 0 && k % 7 == 0){
                System.out.print(k + " ");
            }
            k++;
        }
        System.out.println();
    }
}






