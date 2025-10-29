import java.util.Scanner;

public class DiceGame {
    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int de1 =(int)(Math.random() * 6) +1;
        int de2 =(int)(Math.random() * 6) +1;
        int total1 = de1 + de2;
        System.out.print("Devine le total des deux dés (entre 2 et 12): ");
        int guess = scanner .nextInt();
        if (guess == total1) {
            System.out.println("Bravo ! tu as deviné correctement 🎉");
        }else{
            System.out.println("Raté ! Le bon résultat était "+ total1);

         */

        // Niveau 2
         /*
        Scanner scanner = new Scanner(System.in);
        int de1 = (int) (Math.random() * 6) + 1;
        int de2 = (int) (Math.random() * 6) + 1;
        int total1 = de1 + de2;
        int guess;

        do {
            System.out.print("Devine le total des deux dés (entre 2 et 12): ");
            guess = scanner.nextInt();
            if (guess != total1){
                System.out.println("Non, essaie encor !");
            }
           } while (guess != total1);
            System.out.println("Bravo ! tu as trouvé le bon résultat 🎉");

          */

        // Niveau 3

        Scanner scanner = new Scanner(System.in);
        int guess;
        int de1, de2, total1;

        // Répeter jusqu'à ce que l'utilisateur devine le bon total

        do {
            // Lancer les dés à chaque tour

            de1 = (int) (Math.random() * 6) + 1;
            de2 = (int) (Math.random() * 6) + 1;
            total1 = de1 + de2;
            System.out.print("Devine le total des deux dés (entre 2 et 12): ");
            guess = scanner.nextInt();
            if (guess != total1) {
                System.out.println("Raté ! Les dés sont relancés...");
            }
              } while (guess != total1);
               System.out.println("Bravo ! Tu as deviné le bon résultat 🎉");





        }
         }



