// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите a - ");
        int a = sc.nextInt();
        System.out.print("Введите b - ");
        int b = sc.nextInt();
        System.out.print("Введите x - ");
        int x = sc.nextInt();
        ///// /////////////////////////////////////1
        if (Math.sqrt(a + b) < x) {
            double y = (a * x * x + b * Math.log10(Math.abs(2 * x)));
            System.out.println("1. y=" + y);
        } else {
            double y = Math.sqrt(a + Math.sin(2 * x));
            System.out.println("1. y = " + y);
        }
        ////////////////////////////////////////////2
        if (3 * a > b) {
            double y2 = (Math.log(x * x) - Math.exp((double) x / 3));
            System.out.println("2. y = " + y2);
        } else {
            double y2 = Math.atan(2 * x - 0.6);
            System.out.println("2. y = " + y2);
        }
        ////////////////////////////////////////////3
        if (3 * b * b > a) {
            double y3 = (Math.exp(Math.sin(x)) + b);
            System.out.println("3. y = " + y3);
        } else {
            double y3 = Math.exp(-x) + a * Math.log(x);
            System.out.println("3. y = " + y3);
        }
        ////////////////////////////////////////////4
        if (Math.abs((a * a) - (b * b)) > b) {
            double y4 = Math.pow(a, (double) x / 2) - Math.exp(Math.cos(x));
            System.out.println("4. y = " + y4);
        } else {
            double y4 = Math.tan(4 * x) - a;
            System.out.println("4. y = " + y4);
        }
        ////////////////////////////////////////////5
        if (Math.abs(a - b * b) > b) {
            double y5 = (Math.log(Math.abs(a * x - b)) - Math.exp(Math.tan(x)));
            System.out.println("5. y = " + y5);
        } else {
            double y5 = Math.tan(4 * x - a);
            System.out.println("5. y = " + y5);
        }
        ////////////////////////////////////////////6
        if (3 * a - b > 0) {
            double y6 = (2 * Math.log(x) - Math.exp((double) (a * x - b) / 10));
            System.out.println("6. y = " + y6);
        } else {
            double y6 = Math.asin((double) x / 10);
            System.out.println("6. y = " + y6);
        }
            ////////////////////////////////////////////7
            if (x * a < b) {
                double y7 = (Math.exp(-2 * x) + Math.pow(a * a * a * a + x, 1 / 4));
                System.out.println("7. y = " + y7);
            } else {
                double y7 = Math.sin(x) - b * b;
                System.out.println("7. y = " + y7);
            }
            ////////////////////////////////////////////8
            if (a*b>2*x) {
                double y8 = (b * Math.exp(-3*x)+Math.sin(a)*Math.sin(a));
                System.out.println("8. y = " + y8);
            } else {
                double y8 = (double) (x * x * x) /a - (double) x /b;
                System.out.println("8. y = " + y8);
            }
            ////////////////////////////////////////////10
            if (3*a>2*b) {
                double y10 = (Math.log(x*x)-Math.asin((double) x /10));
                System.out.println("10. y = " + y10);
            } else {
                double y10 = Math.atan((2 * x) - 0.6)+ 2 * Math.log(x);
                System.out.println("10. y = " + y10);
            }


        }
    }

