package Lesson005;

import java.util.Random;
public class Massiv2 {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n = rnd.nextInt(10)+1;
        int m = n;

        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = rnd.nextInt(90) + 10;
            }
        }
        System.out.println("Двумерный массив:");
        for(int i=0; i < n; i++){
            for (int j=0; j < n;j++ ){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}