package Job;
   public class java5{

       public static int occurrences(String str, char caractere) {
           int count = 0;
           for (int i = 0; i < str.length(); i++) {
               if (str.charAt(i) == caractere) {
                   count++;

           }
       }

           return count;
       }

       public static void main(String[] args) {
        System.out.println(occurrences("programmation", 'm')); // 2
       }




   }







