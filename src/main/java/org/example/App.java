package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args ) {
        System.out.println( "Hello World я Александр!" );

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число чтобы вычислить площадь квадрата с произвольными сторонами : ");
        int S_sq = in.nextInt();
        System.out.print("Введите число чтобы вычислить площадь круга c произвольным радиусом : ");
        int S_ci = in.nextInt();
        System.out.print("Введите три числа чтобы вычислить площадь треугольника с произвольными сторонами : ");
        int S_trian_a = in.nextInt();
        int S_trian_b = in.nextInt();
        int S_trian_c = in.nextInt();
        System.out.printf("Введенное вами число для вычисления площади квадрата : %d \n", S_sq);
        System.out.printf("Введенное вами число для вычисления площади круга : %d \n", S_ci);
        System.out.printf("Введенное вами число для вычисления площади треугольника (a): %d \n", S_trian_a);
        System.out.printf("Введенное вами число для вычисления площади треугольника (b): %d \n", S_trian_b);
        System.out.printf("Введенное вами число для вычисления площади треугольника (c): %d \n", S_trian_c);
        in.close();

        S_square(S_sq);
        S_circle(S_ci);
        S_triangle(S_trian_a, S_trian_b, S_trian_c);
    }

    static void S_square(double S_sq){
        double res = S_sq * S_sq;
        System.out.println("площадь квадрата: " + res);
    }
    static void S_circle(double S_ci){
        double res = 3.14 * (S_ci * S_ci);
        System.out.println("площадь круга: " + res);
    }
    static void S_triangle(double S_trian_a, double S_trian_b, double S_trian_c){
        double p = (S_trian_a + S_trian_b + S_trian_c)/2;
        double res = Math.sqrt( p * (p - S_trian_a) * (p - S_trian_b) * (p - S_trian_c) );
        System.out.println("площадь треугольника: " + res);
    }

}
