import java.util.Scanner;
import static java.lang.Math.*;

public class Kalculater3000 {
    public static void main(String[] args) {
        System.out.println("Нажмите: '1' - калькулятор или '2' - решение квадратного уравнения: ");
        Scanner in = new Scanner(System.in);
        System.out.print(" ");
        int choose = in.nextInt();
        if (choose==1) {
            System.out.println("Введите 1-ое число:");
            int a= in.nextInt();
            System.out.println("Введите 2-ое число:");
            int z = in.nextInt();
            System.out.println("Выберите операцию:1 - '+' 2 - '-' 3 - '*' 4 - '/' ");
            int operation = in.nextInt();
            if (operation==1) {
                System.out.println("Ответ:");
                System.out.println(a+z);
            } else if (operation==2) {
                System.out.println("Ответ:");
                System.out.println(a-z);
            } else if (operation==3) {
                System.out.println("Ответ:");
                System.out.println(a*z);
            } else if (operation==4) {
                System.out.println("Ответ:");
                System.out.println(a/z);
            }
        } else if (choose==2) {
            System.out.println("Введите коэффициент 'a':");
            int a= in.nextInt();
            System.out.println("Введите коэффициент 'b':");
            int b = in.nextInt();
            System.out.println("Введите коэффициент 'c':");
            int c = in.nextInt();
            int D = b*b-4*a*c;
            if (D < 0) {
                System.out.println("Корней нет");
            }else {
                if (D > 0) {
                    double q= (-1*b+sqrt(D) )/2*a;
                    double w= (-1*b-sqrt(D) )/2*a;
                    System.out.println("Корни вашего уравнения:");
                    System.out.println(q);
                    System.out.println(w);
                }else {
                    double  x= (-1*b/2/a);
                    System.out.println(x);
                }
            }




        }
    }

}