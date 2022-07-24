package one.dio.bootcamp.exercicio1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Calculadora
        int valor1, valor2;
        System.out.println("Exercício calculadora:");
        System.out.println("Informe o primeiro valor: ");
        valor1 = scan.nextInt();
        System.out.println("Informe o segundo valor: ");
        valor2 = scan.nextInt();
        Calculadora.soma(valor1,valor2);
        Calculadora.subtracao(valor1,valor2);
        Calculadora.multiplicacao(valor1,valor2);
        Calculadora.divisao(valor1,valor2);

        //Mensagem
        int hora;
        System.out.println(" ");
        System.out.println("Exercício mensagem:");
        System.out.println("Que horas são? ");
        hora = scan.nextInt();
        Mensagem.obterMensagem(hora);

        //Emprestimo
        System.out.println(" ");
        System.out.println("Exercício emprestimo:");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());

    }
}

