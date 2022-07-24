package one.dio.bootcamp.exercicio2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int valor1, valor2, valor3;

        System.out.println("Ecercicio quadrilatero: ");
//        Quadrado
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
//        Quadrilatero.area(valor1); -- tipo de resolução com método void
        double areaQuadrado = Quadrilatero.area(valor1);
        System.out.println("Área do quadrado: " + areaQuadrado);

//        Retangulo
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
        System.out.println("Informe o outro valor: ");
        valor2 = scan.nextInt();
//        Quadrilatero.area(valor1,valor2); -- tipo de resolução com método void
        double areaRetangulo = Quadrilatero.area(valor1, valor2);
        System.out.println("Área do retângulo: " + areaRetangulo);

//        Trapezio
        System.out.println("Informe o um valor: ");
        valor1 = scan.nextInt();
        System.out.println("Informe o outro valor: ");
        valor2 = scan.nextInt();
        System.out.println("Informe o último valor: ");
        valor3 = scan.nextInt();
//        Quadrilatero.area(valor1,valor2,valor3); -- tipo de resolução com método void
        double areaTrapezio = Quadrilatero.area(valor1, valor2, valor3);
        System.out.println("Área do trapézio: " + areaTrapezio);

    }
}
