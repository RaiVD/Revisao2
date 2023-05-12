package Exercicios;

//3. Crie um programa para verificar se o inteiro fornecido é um
//        múltiplo de 5 e 7.

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numro inteiro: ");
        int numeroInteiro = entrada.nextInt();


        if (numeroInteiro % 5 == 0 && numeroInteiro % 7 == 0){
            System.out.println("O numero é multiplo de 5 e 7");

        }else{
            System.out.println("O numero não é multiplo de 5 e 7");
        }


    }


}
