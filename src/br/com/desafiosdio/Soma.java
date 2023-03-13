package br.com.desafiosdio;

import java.util.Scanner;
//Neste desafio, faça um programa que calcule o valor de H com N termos.
//
//Sendo, H = 1 + 1/2 + 1/3 + 1/4 + ... + 1/N.
//
//Entrada
//A entrada consiste em um número inteiro positivo.
//
//Saída
//Na saída será impresso o valor que representa a soma dos termos.
public class Soma {
    public static void main(String[] args) {

        double h = 0;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            h = h + (double) 1 / i;

        }
        System.out.println(Math.round(h));

    }
}
