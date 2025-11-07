import java.util.Scanner;

   public class Bienvenue {

    public static void main (String[] arge) {

     /*
   // Exercise demande l'age TIP .nextInt

     Scanner scanner = new Scanner(System.in);

     System.out.println("What is your name?");

      String nom = scanner.nextLine();

      System.out.println("Your name is:" + nom + "Welcome to java world");
      System.out.println("What is your prenom?");
      Scanner nScanner= new Scanner(System.in);

      System.out.println("How old are you?:");

      int age = nScanner .nextInt();

      System.out.println("Your age is:" + age);

      nScanner.close();



      Scanner input = new Scanner(System.in);

      System.out.println("How old you?");

      int age = input.nextInt();

*/
        /*
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number.");
     int num = input.nextInt();
     if (num % 2 == 0) {
         System.out.println("The number is " + num + ", it is a pair.");
     } else {
         System.out.println("The number is " + num + ", it is not a pair.");
         input.close();
     }

         */


        //

        // + addition
        /*
          System.out.println(1 + 2); // 3
             // - soustraction
          System.out.println(3 - 1); // 2
              // * multiplication
          System.out.println(5 * 2); // 10
               // / division
          System.out.println(10 / 2); // 5
                // % modulo
          System.out.println(10 % 2); // 0

          System.out.println(10 % 3); // 1
             // () parenthese
          System.out.println((7 * 2) + 3);



         */


        // condition if/else if/else

          /* Si la condition dans le if entre les parenthes est vrais
          on execute le code entre les {...} si no on pase aux ligne
           de code entre les {...} du else
           */

           /*
           int age = 7;
           if (age >= 1 && age < 18 ) {
                 System.out.println("You'er young");
            } else if (age >= 18 && age < 65) {
                 System.out.println("You're an adult");
           } else if (age >= 65 && age <= 110) {
                   System.out.println("you'er old");
            } else {
               System.out.println("wrong number or no valid");

            */

         /*
        int[] arr = {84, 12, 1, 43, 5, 0};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Affichage du tableau trié
        System.out.print("Tableau trié : ");

        for (int num : arr) {
            System.out.print(num + " ");
          }


          */


      /*

           // Transtipage implicite

             Scanner scanner = new Scanner(System.in);

             // Lire un entier n
              System.out.print("Entrez un entier : ");
             int n = scanner.nextInt();

              int somme = 0;

             // Parcourir tous les entiers strictement inférieurs à n
             for (int i = 1; i < n; i++ ) {

                 // Vérifier si i est multipe de l'un des nombres
                 if (i % 4 == 0 || i % 5 == 0 || i % 7 == 0 || i % 9 == 0 || i % 11 == 0) {

                     somme += i;
                 }
        }        // Aficher le résultat

              System.out.println("La somme est : " + somme);

         scanner.close();

         */





        }
    }








