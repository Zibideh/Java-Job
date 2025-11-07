package Job;

public class java2 {

    public static void bonjour(boolean jour) {
        if (jour) {

            System.out.println("Bonjour");
        } else {
            System.out.println("bonsoir");
        }
    }

       public static void main(String[] args){

           bonjour(true); //affiche " bonjour"
           bonjour(false);//affiche " bonsoir"
       }



}
