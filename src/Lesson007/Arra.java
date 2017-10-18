package Lesson007;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
class Arra {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int n, pol = 1, otr = 0;
        ArrayList<Integer> chisla = new ArrayList<>();
        System.out.print("Количество чисел = ");
        n = scn.nextInt();
        for (int i = 0; i < n; i++) {
            chisla.add((int) (Math.random() * -200 + 100));
        }
        System.out.println("Числа \n" + chisla);

        for (int i = 0; i < n; i++) {
            if (chisla.get(i) > 0) {
                pol *= i;
            } else {
                otr += i;
            }
            System.out.println(pol);
            System.out.println(otr);
        }
    }
}

