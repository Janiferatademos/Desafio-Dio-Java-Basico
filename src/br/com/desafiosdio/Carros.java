

//O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e
// dos impostos (aplicados ao custo de fábrica). O gerente de uma loja de carros gostaria de um programa para
// calcular o preço de um carro novo para os clientes. Você receberá o custo de fábrica e as porcentagens
// referentes ao distribuidor e os impostos e deverá escrever programa para ler esses valores e imprimir o
// valor final do carro.
//
//Entrada
//Você recebera três valores inteiros que representam o custo de fábrica, as porcentagens do distribuidor e os
// impostos.
//
//Saída
//Como saída, teremos o valor final do preço de um carro novo...//
  package br.com.desafiosdio;

   import java.util.Scanner;
   public class Carros {
    public static void main (String[]args){
    Scanner scan = new Scanner(System.in);

    double custoFabrica = scan.nextDouble();
    double porcentagemDistribuidor = scan.nextDouble();
    double percentualImpostos = scan.nextDouble();

    double valorDistribuidor = custoFabrica * (porcentagemDistribuidor / 100);
    double valorImpostos = custoFabrica * (percentualImpostos / 100);
    double precoFinal = custoFabrica + valorDistribuidor + valorImpostos;

            System.out.println(String.format("%.0f",precoFinal));
}
}