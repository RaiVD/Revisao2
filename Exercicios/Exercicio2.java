package Exercicios;

//2.Criar um programa que calcule a média de salários de uma
//        empresa, pedindo ao usuário a grade de funcionários e os
//        salários, e devolvendo a média salarial.

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float media=0, salario=0;
        float mediaTotal = 0;

        System.out.println("Digite a quantidade de funcionarios: ");
        int quantidadeFuncionarios = entrada.nextInt();


        for(int i=0; i< quantidadeFuncionarios; i++){
            salario++;

            System.out.println("Qual o salario do funcionario?");
            int salarioFuncionario = entrada.nextInt();


            media = media + salarioFuncionario;
        }
        mediaTotal = media / quantidadeFuncionarios;

        System.out.println("A média de salario da empresa é: "+mediaTotal);

    }

}


