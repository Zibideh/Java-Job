import java.net.SocketTimeoutException;
import java.util.Scanner;

    public class Exemple {
    public static  void main() {


        /*
        int age = 5;
        System.out.println(age >= 1);
        // && ET
        if (age >= 1 && age < 18) {
            System.out.println("You'er young");
        } else if (age >= 18 && age < 69) {
            System.out.println("You're an adult");
        } else if (age >= 69 && age <= 110) {
            System.out.println("you'er old");
        } else {
            System.out.println("wrong number or no valid");
         */

          /*
            int nombre = -5;
            // tu peut changer le valeur pour tester

            if (nombre > 0) {
                System.out.println("Le nombre est positif.");
        } else if (nombre < 0) {
                System.out.println("Le nombre est négatif.");
          } else {
                System.out.println("Le nombre est nul.");
         */

       /*
        int note = 14; // Essaie différentes valeurs

        if (note >= 16 && note <= 20) {
            System.out.println("Très bien");
        } else if (note >= 12) {
            System.out.println("Bien");
        } else if (note >= 10) {
            System.out.println("Assez bien");
        } else if (note >= 0) {
            System.out.println("Insuffisant");
        } else {
            System.out.println("Note invalide !");

         */

        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Tapez votre premier chifre");
        int a = input.nextInt();
        System.out.println("Tapez votre deuxiéme chifre");
        int b = input.nextInt();

        if (a < b) {
            System.out.println("Le premier nombre est le plus grand.");
        } else if (a < b) {
            System.out.println("Le deuxiéme nombre est le plus grand.");
        }  else {
            System.out.println("Les deux nombres sont égaux.");

            /*
            int number = 0;

            while (number <= 10 ) {
                System.out.println(number);
                numbre--;
            } */

            /*
        for (int x = 0; x <= 10; x++) {
            System.out.println(x);
        }
           for (int i = 0; i <=10; i++) {
               for (int j = 0; j <= 10; j++) {
                   System.out.print("*");
               }
               System.out.println();

             */




            /*
            boolean run = true;
              Scanner input = new Scanner(System.in);
              System.out.println("Select a number");
               int choice = input.nextInt();
               while (run) {
              if (choice > 0 && choice < 5) {
                   System.out.println("Good choice");
              run = false;
             } else {
                  System.out.println("Wrong choice select between 1 and 4");
                  choice = input.nextInt();

              }


             */

              /*
               int number = 10;
               while (number >= 0) {
                   System.out.println(number);
                   number--;


               */


        int sum = 0;
        for ( int i = 1;i<= 100; i++){
            sum = sum + i;
        }

        System.out.println("the sum is" + sum);



    }
}


