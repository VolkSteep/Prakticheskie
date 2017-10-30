package Lesson009;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введи двузначное число ");
        int n = scn.nextInt();
        System.out.println("Введи число a ");
        int a = scn.nextInt();
        Test avm = new Test();
        avm.n = n;
        avm.a = a;
        avm.xxx();
        System.out.println(avm.message);
    }

}
