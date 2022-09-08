package application;

import entities.Triangle;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Insira as medidas do triângulo X: ");
        x.a = scan.nextDouble();
        x.b = scan.nextDouble();
        x.c = scan.nextDouble();
        System.out.println("Insira as medidas do triângulo Y: ");
        y.a = scan.nextDouble();
        y.b = scan.nextDouble();
        y.c = scan.nextDouble();


        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Area do Triângulo X: %.4f%n", areaX);
        System.out.printf("Area do Triângulo Y: %.4f%n", areaY);

        if(areaX > areaY) {
            System.out.println("Maior área: X");
        } else {
            System.out.println("Maior área: Y");
        }

        scan.close();
    }
}
