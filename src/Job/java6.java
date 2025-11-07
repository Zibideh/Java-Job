package Job;

import java.util.Scanner;

public class java6 {
    public static String leetSpeak (String str) {
        String  resultat = "";


            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);

                // Vérifié chaque lettre et remplace si nécessaire

            if (c == 'A' || c == 'a') {
                resultat += '4';
            } else if (c == 'B' || c == 'b') {
                resultat  +='8';
            } else if (c == 'E' || c == 'e') {
                resultat += '3';
            } else if (c == 'G' || c == 'g') {
                resultat += '6';
            } else if (c == 'L' || c == 'l') {
                resultat += '1';
            } else if (c == 'S' || c == 's') {
                resultat += '5';
            } else if (c == 'T' || c == 't') {
                resultat += '7';
            } else {
            }
            resultat += c;

            }
            return resultat;
        }



           public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
               System.out.print("Entrez une phrase à transformer : ");
               String phrase = scanner.nextLine();

               String leet = leetSpeak(phrase);
               System.out.println("Leet Speak : " + leet);

            scanner.close();
                // Affiche : 6R347 84115
           }


}





