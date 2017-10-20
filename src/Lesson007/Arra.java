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
            chisla.add(rnd.nextInt(199 )-99);

        }


        for (int i = 0; i < n; i++) {
            if (chisla.get(i) > 0) {
                pol *= chisla.get(i);
            }
            if(chisla.get(i) < 0) {
                otr += chisla.get(i);
            }
        }
        System.out.println("Изачательный массив:\n"+chisla);

        for (int i = 0; i < 1; i++) {
            chisla.add(0,otr);
            chisla.add(pol);
        }
        System.out.println(chisla);
    }

}

