package calculator;

// hello 
// Changes  the code in the overloading method
import java.util.Scanner;

public class Cal {

    int nu1;
    int nu2;
    char ch;
    char repeat;
    static char o;
    static char p;
    static char l = 'Y';
    static char k = 'y';

    public void add() {
        System.out.println("Your values is : " + (nu1 + nu2));
    }

    public void sub() {
        System.out.println("Your values is : " + (nu1 - nu2));
    }

    public void mul() {
        System.out.println("Your values is : " + nu1 * nu2);
    }

    public void div() {
        System.out.println("Your values is : " + nu1 / nu2);
    }

    public void rem() {
        System.out.println("Your values is : " + nu1 % nu2);
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
                    v.add();
                    break;
                case '-':
                    v.sub();
                    break;
                case '*':
                    v.mul();

                    break;
                case '/':
                    v.div();
                    break;
                case '%':
                    v.rem();

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
