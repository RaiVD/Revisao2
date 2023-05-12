package Exercicios;

//6. Crie um programa para exibir a soma de 20 números
//        usando uma matriz.

import java.util.Random;

public class Exercicio6 {
    public static void main(String[] args) {

        Random random = new Random();

        int linhas = 10;
        int colunas = 2;
        int soma = 0;

        int[][] matriz = new int[linhas][colunas];

        for (int i = 0; i < linhas; i++) {

            for (int j = 0; j < colunas; j++) {
                matriz[i][j] = random.nextInt(20);
                System.out.print("[" + matriz[i][j] + "]");

                soma += matriz[i][j];
            }
            System.out.println();
        }
        System.out.println("Total da soma é: " + soma);
    }

}

