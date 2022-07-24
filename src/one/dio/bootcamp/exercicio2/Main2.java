package one.dio.bootcamp.exercicio2;

import java.util.Scanner;

public class Main2 {

    public static void main2(String[] args){

        Scanner scan = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Ecercicio quadrilatero: ");
//        Quadrado
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
        Quadrilatero.area(valor1);
//        Retangulo
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
        System.out.println("Informe o outro valor: ");
        valor2 = scan.nextInt();
        Quadrilatero.area(valor1,valor2);
//        Trapezio
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
        System.out.println("Informe o outro valor: ");
        valor2 = scan.nextInt();
        System.out.println("Informe o último valor: ");
        valor3 = scan.nextInt();
        Quadrilatero.area(valor1,valor2,valor3);
    }
}
