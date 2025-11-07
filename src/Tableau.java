public class Tableau {


    public static void main(String[] args) {

        // job 1
         /*
        int[] nombres = {200, 204, 173, 98, 171, 404, 459};

        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i] % 2 == 0) {
                System.out.println(nombres[i] + " est pair");
            } else {
                System.out.println(nombres[i] + " est impair");

            }

          */
        //jab 2


       /*
        String str = "Tous ces instants seront perdus dans le temps comme les larmes sous la pluie.";
        String resultat = "";

        for (int i = 0; i < str.length(); i += 2) {
            resultat += str.charAt(i);
        }

        System.out.println(resultat);

        */
        // job 3
        /*
        String str = "I'm sorry Dave I'm afraid I con't do that.";
        String voyelles = "";

        for (int i = 0; i < str.length(); i ++) {
            char c = str.charAt(i);
            if ("aeiouAEIOU".indexOf(c) != -1) {
                voyelles  += c;

            }

            }
        System.out.println(voyelles);


         */
        // job 4
       /*
          String str ="Dans l'espace,perssone ne vous entend crier";
          int nbCaracters = str.length();
          System.out.println("Nombre de caractèrs :" + nbCaracters);
*/

        // job 5


       String str = "On n’est pas le meilleur quand on le croit mais quand on le sait.";
         int voyelles = 0;
         int consonnes = 0;

         for (int i = 0; i < str.length(); i++) {
         // pour samplifier la comparation
          char c = str.charAt(i);

          if (c>= 'a' && c<= 'z' || c>= 'A' && c<= 'Z') {
           // on ne compte que les lettre
        if ("aeiouyO".indexOf(c) != -1) {
            voyelles++;
        } else  {
            consonnes++;
        }
     }
  }

          System.out.println("Voyelles : " + voyelles);
          System.out.println("Consonnes : " + consonnes);



        // job 6

        /*

        String str ="Les choses que l'on possède finissent par nous posséder.";
        String inverse = "";

        for (int i = str.length()- 1; i >= 0; i--) {
            inverse += str.charAt(i);
        }
             System.out.println(inverse);

         */


        // job 7

        /*
        String str ="Certaines choses changent, et d'autres ne changeront jamais.";
        // StringBuilder nouvelleChaine = new StringBuilder();
        char[] charArray = str.toCharArray();

        // Mettre le deuxième caractère en majuscule au début
       // char premier = (str.charAt(0));
       // char suivant = (str.charAt(1));
        System.out.print(Character.toUpperCase(charArray[1]));

        for (int i = 2;i<charArray.length;i++) {
            System.out.print(charArray[i]);
        }

        // Ajouter le premier caractère en minuscule à la fin


        System.out.print(Character. toLowerCase(charArray[0]));



         */




    }
}





























