package Lesson000;
import java.util.Scanner;

class Kryg{
    public static void main(String[] args){
        int r;
        double d;
        Scanner in= new Scanner(System.in);
        System.out.print("Введи r = ");
        r = in.nextInt();

        d = r*2;
        System.out.print("Значение d = ");
        System.out.println(d);
    }
}