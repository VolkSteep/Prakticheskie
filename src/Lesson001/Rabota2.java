package Lesson001;

import java.util.Scanner;
class Chislo {
    public static void main(String[] args){
        int n;
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи число: ");
        n = scn.nextInt();
        if(n % 2 == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}