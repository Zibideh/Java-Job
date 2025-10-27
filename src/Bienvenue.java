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
     Scanner input = new Scanner(System.in);
     System.out.println("Enter a number.");
     int num = input.nextInt();
     if (num % 2 == 0) {
         System.out.println("The number is " + num + ", it is a pair.");
     } else {
         System.out.println("The number is " + num + ", it is not a pair.");
         input.close();
     }

 }

}