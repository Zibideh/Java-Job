package Job;

import java.util.Scanner;

  class Job07 {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);

          System.out.println("Choisissez une transformation : gras / cesar / plateforme");
          String choix = scanner.nextLine();

          System.out.println("Entrez une phrase :");
          String phrase = scanner.nextLine();

          String resultat = switch (choix.toLowerCase()) {
              case "gras" -> gras(phrase);
              case "cesar" -> cesar(phrase);
              case "plateforme" -> plateforme(phrase);
              default -> "Option inconnue !";
          };

          System.out.println("Résultat : " + resultat);
          scanner.close();
      }

      public static String gras(String texte) {
          String resultat = "";
          String[] mots = texte.split(" ");
          for (String mot : mots) {
              if (!mot.isEmpty() && Character.isUpperCase(mot.charAt(0))) {
                  resultat += "*" + mot + "*";
              } else {
                  resultat += mot;
              }
              resultat += " ";
          }
          return resultat.trim();
      }

      public static String cesar(String texte) {
          String resultat = "";
          for (char c : texte.toCharArray()) {
              if (Character.isLetter(c)) {
                  char base = Character.isUpperCase(c) ? 'A' : 'a';
                  c = (char) ((c - base + 2) % 26 + base);
              }
              resultat += c;
          }
          return resultat;
      }

      public static String plateforme(String str) {
          String resultat = "";//
          String[] mots = str.split(" ");
          for (String mot : mots) {
              if (mot.endsWith("me")) {
                  mot += "_";
              }
              resultat += mot + " ";
          }
          return resultat.trim();

      }


  }
