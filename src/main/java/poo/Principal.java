package poo;

import java.util.Scanner;

public class Principal {
    /**
     *  Esse método faz a soma de dois inteiros
     * @param a primeiro inteiro
     * @param b segundo inteiro
     * @return soma dos dois inteiros
     */

    public static void main(String[] args) {

        System.out.println("Olá mundo");
        Scanner teclado = new Scanner(System.in);
        int a, b;

        System.out.println("Entre com um número:");
        a = teclado.nextInt();
        System.out.println("Entre com um número:");
        b = teclado.nextInt();

        Aritmetica p = new Aritmetica();

        System.out.println("O resultado da soma é:" + p.soma(a,b));
        System.out.println("O resultado da multiplicação é: " + p.multiplicacao(a,b));
        System.out.println("O resultado da divisão:" + p.divisao(a,b));
        System.out.println("O resultado da subtração é: " + p.subtracao(a,b));


    }
}
