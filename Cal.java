import java.util.Scanner;
// hello

class Cal {

    static int nu1;
    static int nu2;
    char ch;
    char repeat;
    static char o;
    static char p;
    static char l = 'Y';
    static char k = 'y';

    static int met(int a, int b) {
     return (a + b);
    }

    static int met(int a, int b, int f) {
        
        return (a - b);
    }
   
    static int met(int a, int b, int g, int j) {
        return (a * b);
    }

    static int met(int a, int b, int g, int j, int l) {
        return (a / b);
    }

    static int met(int a, int b, int g, int j, int l, int k) {
        return (a % b);
    }

    public static void main(String[] args) {

        Cal v = new Cal();
        Scanner vik = new Scanner(System.in);

        do {
            System.out.print(" Enter the 1st number : ");
            int a = vik.nextInt();
            System.out.print(" Enter the 2nd number : ");
            int b = vik.nextInt();
            System.out.print(" Type the operation '+ - * / %' : ");
            char c = vik.next().charAt(0);
            v.nu1 = a;
            v.nu2 = b;

            switch (c) {

                case '+':
                    System.out.println(  " Your values is "+   met(nu1, nu2));
                    break;
                case '-':
                    System.out.println(  " Your values is "+  met(nu1, nu2, nu1));
                    break;
                case '*':
                    System.out.println(  " Your values is "+   met(nu1, nu2, nu2, nu2));

                    break;
                case '/':
                    System.out.println(   " Your values is "+  met(nu1, nu2, nu2, nu2, nu2));
                    break;
                case '%':
                    System.out.println(  " Your values is "+  met(nu1, nu2, nu2, nu2, nu2, nu2));

                    break;

                default:
                    System.out.println("plz vaild operation ");
                    break;

            }
            System.out.println(" Do you want to repeat this method : type 'yas' ya 'No' (yes Y) (No N)  ");
            char repeat = vik.next().charAt(0);
            p = repeat;
            o = repeat;

        } while (p == l || o == k);
    }

}
