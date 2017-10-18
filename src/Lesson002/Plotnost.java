package Lesson002;

import java.util.Scanner;
class Plotnost {
    public static void main(String arg[]) {
        Scanner n = new Scanner(System.in);
        double r=0;
        for (int i = 1; i < 13; i++){

            System.out.println("Район № " +i+  " Количество человек?");
            int Ch = n.nextInt();
            System.out.println("Район № " +i+  " Площадь района?");
            int S = n.nextInt();
            double P = Ch/S;
            r = r +P;

        }
        System.out.println("Плотность населения области "  + r);
    }

}