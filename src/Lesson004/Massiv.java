package Lesson004;

import java.util.Random;
import java.util.Scanner;
class Massiv {
    public static void main(String [] args ){
        Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int n;
        System.out.print("Кол-во элементов в массиве = ");
        n = scn.nextInt();
        int [] arrayA = new int[n];

        for(int i=0; i < n; i++) {
            arrayA[i] = rnd.nextInt(10)+1;

        }
        System.out.println("Вывод массива");
        for (int i=0; i < n; i++) {
            System.out.print(arrayA[i] + " ");
        }
        System.out.println("\nВыбери первый элемент");
        int k = scn.nextInt();
        k = k-1;
        System.out.println("Выбери второй элемент");
        int s = scn.nextInt();
        s = s - 1;
        System.out.println("Введенные элементы: " +arrayA[k]+" "+arrayA[s]);
        for(int i=0; i < 1; i++){
            if(arrayA[k] > arrayA[s]){
                System.out.println("Первый элемент больше");
            }else {
                System.out.println("Второй элемент больше");
            }

        }

    }
}

