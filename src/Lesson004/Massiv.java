package Lesson004;
import java.util.Scanner;
class Massiv {
    public static void main(String [] args ){
        Scanner scn = new Scanner(System.in);
        int n,a = 0,b = 0;
        int k = 0;
        int s = 0;
        int[] arrayA;
        System.out.println("Количество элементов в массиве = ");
        n = scn.nextInt();
        arrayA = new int [n];
        for (int i = 0; i < 1; i++) {
            System.out.println("Выбери первый элемент");
            arrayA[k] = scn.nextInt();
            a = arrayA[k];
            System.out.println("Выбери второй элемент");
            arrayA[s] = scn.nextInt();
            b = arrayA[s];
        }
        for (int i = 0; i < 1; i++) {
            if ( a > b ){
                System.out.println("Первый элемент больше");
            } else {
                System.out.println("Второй элемент больше");
            }
        }
    }
}