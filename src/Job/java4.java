package Job;

public class java4 {
    public static int calcule(int a, char opérateur, int b) {
        switch (opérateur) {

            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return b != 0 ? a / b : 0; // évite division par zéro
            case '%':
                return b != 0 ? a % b : 0;
            default:
                return 0;

        }
    }

    public static void main(String[] args) {
        System.out.println(calcule(10,'+',5)); //15
        System.out.println(calcule(10,'/',0));// 0 sécurité
    }
}