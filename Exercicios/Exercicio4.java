package Exercicios;

//4. Crie um programa para exibir o inteiro fornecido pelo
//        usuário na ordem inversa.

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int numero;
        int numeroInvertido = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número desejado: ");
        numero = entrada.nextInt();

        entrada.close();

        while (numero > 0) {
            numeroInvertido = numeroInvertido *10;
            numeroInvertido = numeroInvertido + (numero % 10);
            numero = numero / 10;
        }
        System.out.println("A inversão do número digitado é: " + numeroInvertido);
    }
}
