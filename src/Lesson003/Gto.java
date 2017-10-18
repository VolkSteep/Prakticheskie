package Lesson003;

import java.util.Scanner;
public class Gto {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n, norma;
        int j = 0;
        double k = 0;
        double sr = 0;
        System.out.print("Норма = ");
        norma = scn.nextInt();
        System.out.print("Колличество студентов = ");
        n =  scn.nextInt();
        for (int i = 1; i < n + 1 ; i++){

            System.out.println("Студент № " + i + " Результат?" );
            k = scn.nextDouble();
            if (k >= norma ){
                j++;
                System.out.println("Студент выполнил норму ");
            } else {
                System.out.println("Студент не выполнил норму ");
            }
        }
        sr = n/k;
        System.out.println("Колличество студентов выполнивших норму = " +j );
        System.out.println("Средний результат по группе = " +sr );
    }
}