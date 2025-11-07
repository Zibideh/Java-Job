import java.util.Scanner;

public class Calcule {

        public static void main (String[] args) {
            Scanner scanner = new Scanner(System.in);
            boolean continuer = true;
            while (continuer) {
                System.out.println("/n=== Menu Clculatrice===");
                System.out.println("1. Addition");
                System.out.println("2. Soustraction");
                System.out.println("3. Multiplication");
                System.out.println("4. Division");
                System.out.println("5. Quitter" );
                System.out.print("Choisissez une option :");

                int choix = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.print("Entrez le premier nombre : ");
                        double a1 = scanner.nextDouble();
                        System.out.print("Entrez le second nombre : ");
                        double b1 = scanner.nextDouble();
                        System.out.println("Résultat :" + (a1 + b1));
                        break;
                    case 2:
                        System.out.print("Entrez le premier nombre : ");
                        double a2 = scanner.nextDouble();
                        System.out.print("Entrez le second nombre : ");
                        double b2 = scanner.nextDouble();
                        System.out.println("Résultat :" + (a2 - b2));
                        break;
                    case 3:
                        System.out.print("Entrez le premier nombre : ");
                        double a3 = scanner.nextDouble();
                        System.out.print("Entrez le second nombre : ");
                        double b3 = scanner.nextDouble();
                        System.out.println("Résultat :" + (a3 * b3));
                        break;
                    case 4:
                        System.out.print("Entrez le premier nombre : ");
                        double a4 = scanner.nextDouble();
                        System.out.print("Entrez le second nombre : ");
                        double b4 = scanner.nextDouble();
                        if (b4 != 0) {
                            System.out.println("Résultat :" + (a4 / b4));
                        } else {
                            System.out.println("Erreur : division par zéro !" );
                        }
                        break;
                    case 5:
                        System.out.println("Fin du programme. À bientôt !");
                        continuer = false;
                        break;
                    default:
                        System.out.println("Choix invalide. veuillez réessayer .");

                }

            }

            scanner.close();

        }

}
