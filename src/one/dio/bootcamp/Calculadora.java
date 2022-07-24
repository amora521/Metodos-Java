package one.dio.bootcamp;

import java.util.Scanner;

public class Calculadora {
    public static void soma(int a, int b) {System.out.println( a + b );}
    public static void subtracao(int a, int b) {System.out.println( a - b );}
    public static void multiplicacao(int a, int b) {System.out.println( a * b );}
    public static void divisao(float a, float b) {System.out.println( a / b );}


    public static void main(String[] args) {

        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;
        }
        System.out.println(num);

        /*int num = 5, count = 1;
        do {
            num += count;
            System.out.print(num);
        } while (count <= 3);*/
    }
}


