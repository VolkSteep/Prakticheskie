package Lesson005;

import java.util.Random;
public class Massiv2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        final int n = rnd.nextInt(10) + 1;
        final int K = rnd.nextInt(10) + 1;

        int[][] array = new int[n][K];
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = rnd.nextInt(90) + 10;

            }
        }
        System.out.println("Двумерный массив:");
        for (int i = 0; i < K; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}